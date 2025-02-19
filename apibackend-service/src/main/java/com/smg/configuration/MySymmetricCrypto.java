package com.smg.configuration;

import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySymmetricCrypto {
    @Bean
    public SymmetricCrypto get(){
        return new SymmetricCrypto(SymmetricAlgorithm.AES, "HeavyFog47000000".getBytes());
    }
}
