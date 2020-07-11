package com.stephen.learning.fegin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author jack
 * @description
 * @date 2020/7/11 11:08
 */
@Data
@Builder
@AllArgsConstructor
public class User {
    private String name;
    private String phone;
    private String email;
    private String address;
}
