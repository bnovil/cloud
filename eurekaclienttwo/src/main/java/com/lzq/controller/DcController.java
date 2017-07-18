package com.lzq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:lzq
 * @discription
 * @since: Created on 2017/7/17 15:34.
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;
    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/dc2")
    public String dc2() {
        System.out.println("this is dc2 ");
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
