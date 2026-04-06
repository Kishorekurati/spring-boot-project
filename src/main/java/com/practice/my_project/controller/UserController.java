package com.practice.my_project.controller;


import com.practice.my_project.dto.UserDetailsDTO;
import com.practice.my_project.entity.User;
import com.practice.my_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/v1/")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("save/user")
    public void saveUserDeatails(@RequestBody UserDetailsDTO userDetailsDTO){
        userService.saveUser(userDetailsDTO);
    }

    @GetMapping("get/allusers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
