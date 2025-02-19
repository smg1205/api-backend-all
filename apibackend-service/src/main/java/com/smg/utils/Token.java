package com.smg.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Date;

public class Token {
    private static final String SECRET = "HeavyFog"; // 替换为您的密钥
    private static final long EXPIRATION_TIME = 1000 * 60 * 60 * 24; // 1天

    // 生成 Token
    public static String generateToken(String username) {
        return JWT.create()
                .withClaim("username", username) // 将用户名存入 Token
                .withIssuedAt(new Date()) // 签发时间
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // 过期时间
                .sign(Algorithm.HMAC256(SECRET)); // 使用 HMAC256 算法签名
    }

    // 验证 Token
    public static boolean verifyToken(String token) {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            DecodedJWT jwt = verifier.verify(token);
            return !jwt.getExpiresAt().before(new Date()); // 判断是否过期
        } catch (Exception e) {
            return false; // 验证失败
        }
    }

    // 获取 Token 中的用户名
    public static String getUsernameFromToken(String token) {
        DecodedJWT jwt = JWT.decode(token);
        return jwt.getClaim("username").asString();
    }
}
