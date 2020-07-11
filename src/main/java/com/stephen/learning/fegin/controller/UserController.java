package com.stephen.learning.fegin.controller;

import com.stephen.learning.fegin.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
 * @description
 * @date 2020/7/11 11:10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public User getUserByName(String name){
        return User.builder().address("湖北襄阳").email("2212128@qq.com").name(name).build();
    }
}
