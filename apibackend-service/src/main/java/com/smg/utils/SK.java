package com.smg.utils;

import cn.hutool.crypto.symmetric.SymmetricCrypto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 获取SK
 */
@Service
public class SK {
    @Resource
    SymmetricCrypto aes;

    /**
     * 获取SK
     * @param username
     * @return
     */
    public String GetSK(String username){
        return aes.encryptHex(System.currentTimeMillis()
                + "." + username);
    }

    /**
     * 解析SK
     * @param secureKey
     * @return
     */
    public String DeSK(String secureKey){
        return aes.decryptStr(secureKey);
    }
}
