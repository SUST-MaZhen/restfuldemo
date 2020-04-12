package com.example.restfuldemo;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description
 * @ClassName UserOperate
 * @Author User
 * @date 2020.04.12 22:21
 */
@RestController
@RequestMapping("/api/v1")
public class UserOperate {
    private static final String template = "hello,%s!";
    private final AtomicInteger counter = new AtomicInteger();

    // get请求
    @GetMapping("/user")
    public User getUser(@RequestParam(value="name",defaultValue = "游客") String name) {
        return new User(String.format(template, name), counter.incrementAndGet());
    }

    // post请求 请求参数为params
    @PostMapping("/user")
    public String addUser(@RequestParam(value="name") String name, @RequestParam(value = "age", required = false) Integer age) {
        System.out.println("my name is "+name+" I am "+age+" years old");
        return "add success";
    }

    // put请求 json参数直接映射到实体类
    @PutMapping("/user")
    public String addUserObj(@RequestBody User user) {
        System.out.println("my name is "+user.getName()+" I am "+user.getAge()+" years old");
        return "update success";
    }
}
