package com.smg.utils;

import cn.hutool.crypto.symmetric.SymmetricCrypto;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 获取AK
 */
@Service
public class AK {
    @Resource
    SymmetricCrypto sc;
    /**
     * 获取AK
     * @param username
     * @return
     */
    public String GetAK(String username){
        return sc.encryptHex(System.currentTimeMillis()
                + "." + username);
    }

    /**
     * 解析AK
     * @param accessKey
     * @return
     */
    public String DeAK(String accessKey){
        return sc.decryptStr(accessKey);
    }
}
