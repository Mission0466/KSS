package com.example.KSS.dtos;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDTO {

    private UserDTO user; // Embedded user information
    private List<OrderItemDTO> orderItems; // List of ordered items
    private int totalPrice;
    private LocalDateTime orderDate; // Changed to LocalDateTime

    // Getters and Setters
    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
