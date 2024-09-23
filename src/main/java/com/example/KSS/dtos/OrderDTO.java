package com.example.KSS.dtos;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    private UserDTO user; // Embedded user information
    private List<OrderItemDTO> orderItems; // List of ordered items
    private int totalPrice;
    private Date orderDate;

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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
