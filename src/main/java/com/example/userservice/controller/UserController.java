package com.example.userservice.controller;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public Optional<User> findUserById(@PathVariable String id){

        return userService.findUserById(id);
    }

    @PatchMapping("{id}")
    public User updateUser(@RequestBody User user){
        userService.updateUserDetail(user);
        return user;

    }

}