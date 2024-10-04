package com.example.KSS.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int weight;
    private int coffeeRatio;
    private int chicoryRatio;
    private Date createdAt;
    private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
// Getters and setters

    public Long getOrderitemId() {
        return orderItemId;
    }

    public void setOrderitemId(Long orderitemId) {
        this.orderItemId = orderitemId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCoffeeRatio() {
        return coffeeRatio;
    }

    public void setCoffeeRatio(int coffeeRatio) {
        this.coffeeRatio = coffeeRatio;
    }

    public int getChicoryRatio() {
        return chicoryRatio;
    }

    public void setChicoryRatio(int chicoryRatio) {
        this.chicoryRatio = chicoryRatio;
    }
}
