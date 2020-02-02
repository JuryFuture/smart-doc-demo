package com.example.smartdocdemo.controller;

import com.example.smartdocdemo.entity.User;
import com.example.smartdocdemo.response.Response;
import com.example.smartdocdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户模块
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @return
     */
    @PostMapping("/login/")
    public Response<User> login() {
        return userService.login();
    }
}
