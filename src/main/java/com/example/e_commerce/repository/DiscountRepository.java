package com.example.e_commerce.repository;

import com.example.e_commerce.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface DiscountRepository extends JpaRepository<Discount, Long> {
    Optional<Discount> findByCode(String code);
}