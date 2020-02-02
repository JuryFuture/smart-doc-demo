package com.example.smartdocdemo.service;

import com.example.smartdocdemo.entity.User;
import com.example.smartdocdemo.response.Response;
import org.springframework.stereotype.Component;

/**
 * 用户服务
 */
@Component
public class UserService {

    /**
     * 登录
     * @return
     */
    public Response<User> login() {
        return new Response<>(0, "SUCCESS", new User(1L, "张三 "));
    }
}
