package com.smg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//@EnableWebMvc
public class ApibackendGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApibackendGatewayApplication.class, args);
    }
}
