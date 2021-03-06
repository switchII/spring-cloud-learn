package com.example.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lilei
 * @version 1.0
 * @time 2019/10/23 14:37
 * @description
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced // 开启负载均衡的功能
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}