package com.smg.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLogging {
    @Bean
    Logger.Level getLevel(){
        return Logger.Level.BASIC;
    }
}
