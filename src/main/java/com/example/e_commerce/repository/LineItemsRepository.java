package com.example.e_commerce.repository;

import com.example.e_commerce.entity.LineItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemsRepository extends JpaRepository<LineItems, Long> {
}
