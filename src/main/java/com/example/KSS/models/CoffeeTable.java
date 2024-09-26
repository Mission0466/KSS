package com.example.KSS.models;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "coffeeTable")
public class CoffeeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long coffeeId;

    private Date createdAt;
    private Date updatedAt;
    private int weight;
    private int coffeeRatio;
    private int chicoryRatio;


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

    private int price;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
