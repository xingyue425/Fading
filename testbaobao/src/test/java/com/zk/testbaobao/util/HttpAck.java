package com.zk.testbaobao.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpAck {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void httpGetConn(){
        //测试get连接
        System.out.println(restTemplate==null);
    }

    @Test
    public void httpPostConn(){
        //测试get连接
    }
}
