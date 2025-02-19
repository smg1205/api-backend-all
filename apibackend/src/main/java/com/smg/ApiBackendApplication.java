package com.smg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients({"com.smg.remote.Impl"})
@EnableHystrix
public class ApiBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiBackendApplication.class, args);
    }
}
