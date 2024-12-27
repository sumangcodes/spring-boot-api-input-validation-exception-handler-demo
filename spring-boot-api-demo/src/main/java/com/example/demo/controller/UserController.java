package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {


    @GetMapping("/v1/users")
    public List<String> getUsersV1()
    {

        return List.of("user1","user2","user3");
    }


    @Deprecated
    @GetMapping("/v1/old-users")
    public List<String> getOldUsers()
    {
        return List.of("old-users1","old-user2","old-user3");
    }


    @GetMapping("/v2/users")
    public List<String> getUsersV2()
    {
        return List.of("user4","user5");

    }
    
}
