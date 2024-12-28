package com.example.e_commerce.repository;

import com.example.e_commerce.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetails, Long> {
}
