package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName("users")
@Data
//@Data//automatically generate getter and setter
public class User {
    @TableId
    private String email;
    private String password;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}