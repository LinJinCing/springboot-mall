package com.sean.springbootmall.dao;

import com.sean.springbootmall.dto.CreateOrderRequest;
import com.sean.springbootmall.model.Order;
import com.sean.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(int orderId);

    List<OrderItem> getOrderItemsByOrderId(int orderId);

    int  createOrder(int userId, int totalAmount);

    void createOrderItems(int orderId, List<OrderItem> orderItemList);
}
