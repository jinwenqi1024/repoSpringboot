package com.mailuo.entity;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 简单自定义一个实体类User,使用lombok简化实体类的编写
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String username;
    private String password;

    /**
     * token的生成方法
     * Algorithm.HMAC256():使用HS256生成token,密钥则是用户的密码，
     * 唯一密钥的话可以保存在服务端。
     * withAudience()存入需要保存在token的信息，这里我把用户ID存入token中
     *
     * @param user
     * @return
     */
    public String getToken(User user) {
        String token = "";
        token = JWT.create().withAudience(user.getId()).sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }

}
