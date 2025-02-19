package com.smg.filters;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public GlobalFilter getGlobalFilter() {
        return new MyGlobalFilter();
    }
}
