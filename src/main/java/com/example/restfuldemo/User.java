package com.example.restfuldemo;

/**
 * @Description
 * @ClassName User
 * @Author User
 * @date 2020.04.12 22:18
 */
public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
