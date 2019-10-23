package com.jerry.springboot_redis_test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class SpringbootRedisTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisTest1Application.class, args);
    }

}
