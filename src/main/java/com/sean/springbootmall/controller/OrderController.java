package com.sean.springbootmall.controller;

import com.sean.springbootmall.dto.CreateOrderRequest;
import com.sean.springbootmall.dto.OrderQueryParams;
import com.sean.springbootmall.model.Order;
import com.sean.springbootmall.service.OrderService;
import com.sean.springbootmall.util.Page;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("users/{userId}/orders")
    public ResponseEntity<Page<Order>> getOrders(
            @PathVariable int userId,
            @RequestParam(defaultValue = "10") @Max(1000) @Min(0) int limit,
            @RequestParam(defaultValue = "0") @Min(0) int offset)
    {
        OrderQueryParams orderQueryParams = new OrderQueryParams();
        orderQueryParams.setUserId(userId);
        orderQueryParams.setLimit(limit);
        orderQueryParams.setOffset(offset);

        // 取得order list
        List<Order> orderList = orderService.getOrders(orderQueryParams);
        // 取得order總數
        int count = orderService.countOrder(orderQueryParams);
        // 分頁
        Page<Order> page = new Page<>();
        page.setLimit(limit);
        page.setOffset(offset);
        page.setTotal(count);
        page.setResults(orderList);

        return ResponseEntity.status(HttpStatus.OK).body(page);




    }

    @PostMapping("/users/{userId}/orders")
    public ResponseEntity<?> createOrder(@PathVariable int userId,
                                         @RequestBody @Valid CreateOrderRequest createOrderRequest) {

        int orderId = orderService.createOrder(userId, createOrderRequest);

        Order order = orderService.getOrderById(orderId);

        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}
