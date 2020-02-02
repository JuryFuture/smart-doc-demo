package com.example.smartdocdemo.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回实体
 * @param <T>
 */
@Data
@AllArgsConstructor
public class Response<T> {
    /**
     * code码
     */
    private int code;

    /**
     * 描述
     */
    private String description;

    /**
     * 返回结果
     */
    private T result;

}
