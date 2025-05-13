package com.sean.springbootmall.dao;

import com.sean.springbootmall.dto.UserRegisterRequest;
import com.sean.springbootmall.madel.User;

public interface UserDao {

    User getUserById(int userId);

    int createUser(UserRegisterRequest userRegisterRequest);
}
