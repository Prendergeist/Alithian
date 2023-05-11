package com.example.demo.controller;

import com.example.demo.common.ApiResponse;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    private final UserMapper userMapper;
    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
    @GetMapping("/login")
    public ApiResponse login(@RequestBody User user) {
        String email = user.getEmail();
        String password = user.getPassword();
        if (userMapper.selectById(email) == null) {
            return new ApiResponse<>(403,"user not exists", null);


    }else {
        User user1 = userMapper.selectById(email);
        if (user1.getPassword().equals(password)) {
            return new ApiResponse<>(200,"login success", user1);
        }else {
            return new ApiResponse<>(403,"password error", null);
        }
    }}
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        String email = user.getEmail();
        String password = user.getPassword();
        System.out.println(user.toString());
        if (userMapper.selectById(email) != null) {
            return "user already exists";
        }else {

            userMapper.insert(user);
            return "register success";
        }
    }

}
