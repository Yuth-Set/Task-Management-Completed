package com.task.mgn.auth.service;

import com.task.mgn.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}