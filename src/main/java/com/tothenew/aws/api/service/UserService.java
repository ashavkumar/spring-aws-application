package com.tothenew.aws.api.service;

import com.tothenew.aws.api.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> findAllUsers();

    User findUserById(Long id);

    User updateUser(User user,Long userId);

    List<User> deleteUser(Long id);
}
