package com.example.e_commerce.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String customerName;
    private Double totalAmount;
    private String discountCode;

    @OneToMany(mappedBy = "orderDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LineItems> lineItems = new ArrayList<>(); // Initialize the list here

    // Constructors
    public OrderDetails() {}

    public OrderDetails(String customerName, String discountCode) {
        this.customerName = customerName;
        this.discountCode = discountCode;
        this.lineItems = new ArrayList<>(); // Initialize in constructor if not already done
    }

    // Getters and Setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public List<LineItems> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItems> lineItems) {
        this.lineItems = lineItems;
    }
}
