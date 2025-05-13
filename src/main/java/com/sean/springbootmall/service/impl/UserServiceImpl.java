package com.sean.springbootmall.service.impl;

import com.sean.springbootmall.dao.UserDao;
import com.sean.springbootmall.dto.UserRegisterRequest;
import com.sean.springbootmall.madel.User;
import com.sean.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public int register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
