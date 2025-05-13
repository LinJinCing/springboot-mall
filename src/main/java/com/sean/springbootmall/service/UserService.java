package com.sean.springbootmall.service;

import com.sean.springbootmall.dto.UserLoginRequest;
import com.sean.springbootmall.dto.UserRegisterRequest;
import com.sean.springbootmall.madel.User;

public interface UserService {

    User getUserById(Integer userId);

    int register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
