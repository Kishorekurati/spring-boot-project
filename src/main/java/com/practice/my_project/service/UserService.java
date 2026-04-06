package com.practice.my_project.service;

import com.practice.my_project.dto.UserDetailsDTO;
import com.practice.my_project.entity.User;

import java.util.List;

public interface UserService {

    public void saveUser(UserDetailsDTO userDetailsDTO);

    public List<User> getAllUsers();
}
