package com.example.e_commerce.service;

import com.example.e_commerce.dto.LineRequestDTO;
import com.example.e_commerce.dto.OrderRequestDTO;
import com.example.e_commerce.entity.*;
import com.example.e_commerce.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;
    private final DiscountRepository discountRepository;

    public OrderService(OrderRepository orderRepository, ItemRepository itemRepository, DiscountRepository discountRepository) {
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
        this.discountRepository = discountRepository;
    }

    public OrderDetails createOrder(OrderRequestDTO orderRequest) {
        OrderDetails orderDetails = new OrderDetails(orderRequest.getCustomerName(), orderRequest.getDiscountCode());
        double totalAmount = 0;

// Adding line items
        for (LineRequestDTO lineRequest : orderRequest.getLines()) {
            Item item = itemRepository.findById(lineRequest.getItemId())
                    .orElseThrow(() -> new RuntimeException("Item not found with ID: " + lineRequest.getItemId()));

            double lineTotal = item.getUnitPrice() * lineRequest.getQuantity();
            totalAmount += lineTotal;

            LineItems lineItem = new LineItems(orderDetails, item, lineRequest.getQuantity(), lineTotal);
            orderDetails.getLineItems().add(lineItem);
        }

        orderDetails.setTotalAmount(totalAmount);

        return orderRepository.save(orderDetails);
    }
}
