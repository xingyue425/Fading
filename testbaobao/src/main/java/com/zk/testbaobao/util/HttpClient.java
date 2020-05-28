package com.zk.testbaobao.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class HttpClient {

    @Autowired
    private RestTemplate restTemplate;

    public void postLottery(String url, MultiValueMap<String, String> params){

        //发送http请求
        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
//        ResponseEntity<ResultVO> response = restTemplate.exchange(url, method, requestEntity, ResultVO.class);
    }
}
