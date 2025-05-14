package com.sean.springbootmall.service;

import com.sean.springbootmall.dto.CreateOrderRequest;
import com.sean.springbootmall.dto.OrderQueryParams;
import com.sean.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    int countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(int orderId);

    int createOrder(int userId, CreateOrderRequest createOrderRequest);
}
