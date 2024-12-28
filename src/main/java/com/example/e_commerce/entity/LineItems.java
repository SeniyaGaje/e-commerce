package com.example.e_commerce.entity;

import jakarta.persistence.*;

@Entity
public class LineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lineItemId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderDetails orderDetails;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    private int quantity;
    private Double lineTotal;

    // Constructors
    public LineItems() {}

    public LineItems(OrderDetails orderDetails, Item item, int quantity, Double lineTotal) {
        this.orderDetails = orderDetails;
        this.item = item;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
    }

    // Getters and Setters
    public Long getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Double lineTotal) {
        this.lineTotal = lineTotal;
    }
}
