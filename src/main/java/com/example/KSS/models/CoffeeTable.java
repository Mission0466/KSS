package com.example.KSS.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "coffeeTable")
public class CoffeeTable extends BaseModel{

    private int weight;
    private int coffeeRatio;
    private int chicoryRatio;
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
