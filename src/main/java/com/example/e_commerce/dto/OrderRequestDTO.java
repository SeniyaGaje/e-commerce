package com.example.e_commerce.dto;

import java.util.List;

public class OrderRequestDTO {

    private String customerName;
    private String discountCode;
    private List<LineRequestDTO> lines;

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public List<LineRequestDTO> getLines() {
        return lines;
    }

    public void setLines(List<LineRequestDTO> lines) {
        this.lines = lines;
    }
}
