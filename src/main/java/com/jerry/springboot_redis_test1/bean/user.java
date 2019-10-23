package com.jerry.springboot_redis_test1.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class user implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    public user()
    {

    }

    @Override
    public String toString() {
        return " "+name;
    }

    public user(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
