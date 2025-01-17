package com.example.e_commerce.repository;

import com.example.e_commerce.entity.Discount;
import com.example.e_commerce.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository
        extends JpaRepository<Item, Long> {}

