package com.sean.springbootmall.service;

import com.sean.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    int createOrder(int userId, CreateOrderRequest createOrderRequest);
}
