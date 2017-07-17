package com.lzq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:lzq
 * @discription
 * @since: Created on 2017/7/17 15:16.
 */

@EnableEurekaServer
@SpringBootApplication
public class ApplicationOne {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationOne.class)
                .web(true).run(args);
    }
}

