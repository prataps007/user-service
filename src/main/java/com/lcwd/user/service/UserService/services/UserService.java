package com.lcwd.user.service.UserService.services;

import com.lcwd.user.service.UserService.entities.User;

import java.util.List;


public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);

}
