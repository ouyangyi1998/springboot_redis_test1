package com.jerry.springboot_redis_test1.controller;

import com.jerry.springboot_redis_test1.bean.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;
    @RequestMapping("/hello")
    public String sayHello()
    {
        stringRedisTemplate.opsForValue().set("msg","Hello Redis");
        String V=stringRedisTemplate.opsForValue().get("msg");

        redisTemplate.opsForValue().set("jerry",new user(1,"Jerry",18));
       String S=redisTemplate.opsForValue().get("jerry").toString();
       return V+S;
    }
}
