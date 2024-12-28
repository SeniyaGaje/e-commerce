package com.example.e_commerce.controller;

import com.example.e_commerce.entity.Discount;
import com.example.e_commerce.repository.DiscountRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/discounts")
public class DiscountController {

    private final DiscountRepository discountRepository;

    public DiscountController(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    // Create a new discount
    @PostMapping
    public ResponseEntity<Discount> createDiscount(@RequestBody Discount discount) {
        discount.setValidUntil(LocalDate.parse(discount.getValidUntil().toString()));
        Discount savedDiscount = discountRepository.save(discount);
        return ResponseEntity.ok(savedDiscount);
    }

    // Get discount by code
    @GetMapping("/{code}")
    public ResponseEntity<Discount> getDiscountByCode(@PathVariable String code) {
        return discountRepository.findByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
