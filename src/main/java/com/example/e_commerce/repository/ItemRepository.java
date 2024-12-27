package com.example.e_commerce.repository;

import com.example.e_commerce.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository
        extends JpaRepository<Item, Long> {}
