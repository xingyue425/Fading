package com.zk.testbaobao.util;



import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.NoHttpResponseException;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;

/** 
 * sendGetRequest() : 发送get请求
 * 
 * org.apache.http.impl.client.CloseableHttpClient链接池生成工具 
 */  
public class HttpClientTool {  
  
    // org.apache.http.impl.client.CloseableHttpClient  
    private static CloseableHttpClient httpclient = null;
  
    // 这里就直接默认固定了,因为以下三个参数在新建的method中仍然可以重新配置并被覆盖.  
    static final int connectionRequestTimeout = 5000;// ms毫秒,从池中获取链接超时时间  
    static final int connectTimeout = 5000;// ms毫秒,建立链接超时时间  
    static final int socketTimeout = 30000;// ms毫秒,读取超时时间  
  
    // 总配置,主要涉及是以下两个参数,如果要作调整没有用到properties会比较后麻烦,但鉴于一经粘贴,随处可用的特点,就不再做依赖性配置化处理了.  
    // 而且这个参数同一家公司基本不会变动.  
    static final int maxTotal = 500;// 最大总并发,很重要的参数  
    static final int maxPerRoute = 100;// 每路并发,很重要的参数  
  
    // 正常情况这里应该配成MAP或LIST  
    // 细化配置参数,用来对每路参数做精细化处理,可以管控各ip的流量,比如默认配置请求baidu:80端口最大100个并发链接,  
    static final String detailHostName = "http://dongshuai.net";// 每个细化配置之ip(不重要,在特殊场景很有用)
    static final int detailPort = 80;// 每个细化配置之port(不重要,在特殊场景很有用)  
    static final int detailMaxPerRoute = 100;// 每个细化配置之最大并发数(不重要,在特殊场景很有用)  
  
    public static CloseableHttpClient getHttpClient(String ip, int port) {
        if (null == httpclient) {  
            synchronized (HttpClientTool.class) {  
                if (null == httpclient) {  
                    httpclient = init(ip, port);  
                }  
            }  
        }  
        return httpclient;  
    }  
  
    /** 
     * 链接池初始化 这里最重要的一点理解就是. 让CloseableHttpClient 一直活在池的世界里, 但是HttpPost却一直用完就消掉. 
     * 这样可以让链接一直保持着. 
     *  
     * @return 
     */  
    private static CloseableHttpClient init(String ip, int port) {
        CloseableHttpClient newHttpclient = null;
  
        // 设置连接池  
        ConnectionSocketFactory plainsf = PlainConnectionSocketFactory.getSocketFactory();
        LayeredConnectionSocketFactory sslsf = SSLConnectionSocketFactory.getSocketFactory();
        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory> create().register("http", plainsf).register("https", sslsf).build();
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
        // 将最大连接数增加  
        cm.setMaxTotal(maxTotal);  
        // 将每个路由基础的连接增加  
        cm.setDefaultMaxPerRoute(maxPerRoute);  
  
        // 细化配置开始,其实这里用Map或List的for循环来配置每个链接,在特殊场景很有用.  
        // 将每个路由基础的连接做特殊化配置,一般用不着  
        HttpHost httpHost = new HttpHost(ip, port);
        // 将目标主机的最大连接数增加  
        cm.setMaxPerRoute(new HttpRoute(httpHost), detailMaxPerRoute);
        // cm.setMaxPerRoute(new HttpRoute(httpHost2),  
        // detailMaxPerRoute2);//可以有细化配置2  
        // cm.setMaxPerRoute(new HttpRoute(httpHost3),  
        // detailMaxPerRoute3);//可以有细化配置3  
        // 细化配置结束  
  
        // 请求重试处理  
        HttpRequestRetryHandler httpRequestRetryHandler = new HttpRequestRetryHandler() {
            @Override
            public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
                if (executionCount >= 2) {// 如果已经重试了2次，就放弃  
                    return false;  
                }  
                if (exception instanceof NoHttpResponseException) {// 如果服务器丢掉了连接，那么就重试
                    return true;  
                }  
                if (exception instanceof SSLHandshakeException) {// 不要重试SSL握手异常
                    return false;  
                }  
                if (exception instanceof InterruptedIOException) {// 超时
                    return false;  
                }  
                if (exception instanceof UnknownHostException) {// 目标服务器不可达
                    return false;  
                }  
                if (exception instanceof ConnectTimeoutException) {// 连接被拒绝
                    return false;  
                }  
                if (exception instanceof SSLException) {// SSL握手异常
                    return false;  
                }  
  
                HttpClientContext clientContext = HttpClientContext.adapt(context);
                HttpRequest request = clientContext.getRequest();
                // 如果请求是幂等的，就再次尝试  
                if (!(request instanceof HttpEntityEnclosingRequest)) {
                    return true;  
                }  
                return false;  
            }  
        };  
  
        // 配置请求的超时设置  
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(connectionRequestTimeout).setConnectTimeout(connectTimeout).setSocketTimeout(socketTimeout).build();
        newHttpclient = HttpClients.custom().setConnectionManager(cm).setDefaultRequestConfig(requestConfig).setRetryHandler(httpRequestRetryHandler).build();
        return newHttpclient;  
    }  
    
    /** 
     * 发送 get请求 
     * 
     * @param url = "http://localhost:8099/refillResponse.uz?accountNo=123456&amount=100&channel=0013";
     */   
    public static String sendGetRequest(String url) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {   
            // 创建httpget.     
            HttpGet httpget = new HttpGet(url);
            //System.out.println("executing request " + httpget.getURI());   
            // 执行get请求.     
            CloseableHttpResponse response = httpClient.execute(httpget);
            try {   
                // 获取响应实体     
                HttpEntity entity = response.getEntity();
                //System.out.println("--------------------------------------");   
                // 打印响应状态     
                //System.out.println(response.getStatusLine());   
                if (entity != null) {   
                    // 打印响应内容长度     
                    //System.out.println("Response content length: " + entity.getContentLength());   
                    // 打印响应内容     
                    //System.out.println("Response content: " + EntityUtils.toString(entity));   
                    
                    String entityContent = EntityUtils.toString(entity);
                    //目前只返回响应内容，响应状态和响应内容长度没有返回
                    return entityContent;
                }   
                System.out.println("------------------------------------");
            } finally {   
                response.close();   
            }   
        } catch (ClientProtocolException e) {
            e.printStackTrace();   
        } catch (ParseException e) {
            e.printStackTrace();   
        } catch (IOException e) {
            e.printStackTrace();   
        } finally {
            // 关闭连接,释放资源     
            try {   
                httpClient.close();   
            } catch (IOException e) {
                e.printStackTrace();   
            }   
        }
        
        return null;   
    }   
    
} 
