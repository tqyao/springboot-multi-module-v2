package com.example.boot.dao.entity;

import java.util.Date;

public class Member {
    private String id;
    private String username;
    private Integer age;
    private Date birthday;

    public Member() {
    }

    public Member(String id, String username, Integer age, Date birthday) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
