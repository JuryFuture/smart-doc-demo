package com.example.smartdocdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户
 */
@Data
@AllArgsConstructor
public class User {
    /**
     * 用户ID
     */
    private long id;

    /**
     * 用户名
     */
    private String name;

}
