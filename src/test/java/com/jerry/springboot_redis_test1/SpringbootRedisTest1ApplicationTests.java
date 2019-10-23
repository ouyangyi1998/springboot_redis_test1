package com.jerry.springboot_redis_test1;

import com.jerry.springboot_redis_test1.bean.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringbootRedisTest1ApplicationTests {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;
    @Test
   public void testStringRedisTemplate()
    {
        stringRedisTemplate.opsForValue().set("msg","Hello Redis");
        String msg=stringRedisTemplate.opsForValue().get("msg");
        System.out.println(msg);
    }
    @Test
    public void testRedisTemplate()
    {
        redisTemplate.opsForValue().set("user",new user(1,"Jerry",18));
        user user=(user)redisTemplate.opsForValue().get("user");
        System.out.println(user);
    }

}
