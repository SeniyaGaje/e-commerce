package com.example.e_commerce.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;  // Discount code (e.g., "SUMMER2024")
    private Integer percentage;  // Discount percentage (e.g., 20)
    private LocalDate validUntil;  // Discount expiration date

    // Constructors
    public Discount() {}

    public Discount(String code, Integer percentage, LocalDate validUntil) {
        this.code = code;
        this.percentage = percentage;
        this.validUntil = validUntil;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }
}
