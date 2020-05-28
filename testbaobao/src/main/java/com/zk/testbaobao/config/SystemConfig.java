package com.zk.testbaobao.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:system.properties")
public class SystemConfig {

    @Value("${bet.url}")
    private String betUrl;

    public String getBetUrl() {
        return betUrl;
    }
}
