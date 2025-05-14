package com.sean.springbootmall.service;

import com.sean.springbootmall.dto.CreateOrderRequest;
import com.sean.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(int orderId);

    int createOrder(int userId, CreateOrderRequest createOrderRequest);
}
