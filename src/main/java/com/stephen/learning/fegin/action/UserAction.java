package com.stephen.learning.fegin.action;


import com.stephen.learning.fegin.model.User;
import feign.Param;
import feign.RequestLine;

/**
 * 消费端声明
 */
public interface UserAction {
    @RequestLine("GET /user/{name}")
    User getUserByName(@Param("name") String name);
}
