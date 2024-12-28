package com.example.e_commerce.controller;

import com.example.e_commerce.dto.OrderRequestDTO;
import com.example.e_commerce.entity.OrderDetails;
import com.example.e_commerce.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<OrderDetails> createOrder(@RequestBody OrderRequestDTO orderRequest) {
        OrderDetails order = orderService.createOrder(orderRequest);
        return ResponseEntity.ok(order);
    }
}
