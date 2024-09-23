package com.example.KSS.dtos;

public class OrderItemDTO {

    private Long orderId; // The order ID that this item belongs to
    private int weight;
    private int coffeeRatio;
    private int chicoryRatio;

    // Getters and Setters

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

