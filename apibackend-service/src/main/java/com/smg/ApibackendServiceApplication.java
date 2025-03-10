package com.smg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@MapperScan("com.smg.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class ApibackendServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApibackendServiceApplication.class, args);
    }

}
