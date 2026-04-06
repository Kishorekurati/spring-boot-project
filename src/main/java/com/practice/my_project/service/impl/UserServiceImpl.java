package com.practice.my_project.service.impl;

import com.practice.my_project.dto.UserDetailsDTO;
import com.practice.my_project.entity.User;
import com.practice.my_project.repository.UserRepository;
import com.practice.my_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void saveUser(UserDetailsDTO userDetailsDTO) {
        User user = new User();
        user.setUserName(userDetailsDTO.getUserName());
        user.setMobileNumber(userDetailsDTO.getMobileNumber());
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> listOfusers = userRepository.findAll();
        return listOfusers;
    }
}
