package com.stephen.learning;

import com.stephen.learning.fegin.action.UserAction;
import feign.Feign;
import feign.Request;
import feign.Retryer;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.junit.Test;

/**
 * @author jack
 * @description
 * @date 2020/7/11 11:20
 */
public class AppTest {

    @Test
    public void test(){
        UserAction userAction = Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .options(new Request.Options(1000, 3500))
                .retryer(new Retryer.Default(5000, 5000, 3))
                .target(UserAction.class,"http://localhost:8090");


        System.out.println(userAction.getUserByName("jack"));

    }
}
