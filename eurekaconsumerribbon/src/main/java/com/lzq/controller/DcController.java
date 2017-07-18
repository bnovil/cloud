package com.lzq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author:lzq
 * @discription
 * @since: Created on 2017/7/17 16:39.
 */
@RestController
public class DcController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
    @GetMapping("/consumer2")
    public String dc2() {
        return restTemplate.getForObject("http://eureka-client/dc2", String.class);
    }
}
