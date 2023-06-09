package com.alithian.app.controller;


import com.alithian.app.model.AlithianUser;
import com.alithian.app.service.IAlithianUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api/user/list")
public class AlithianUserController {
    @Autowired
    private IAlithianUserService service;

    @PostMapping("/add")
    public Boolean add(@RequestBody AlithianUser body) {
        return service.add(body);
    }

    @PostMapping("/login")
    public AlithianUser login(@RequestBody AlithianUser body) {
        return service.login(body);
    }
}
