package com.example.KSS.services;

import com.example.KSS.dtos.CoffeeTableDTO;
import com.example.KSS.models.CoffeeTable;
import com.example.KSS.repositories.CoffeePowderRegRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeePowderRegistrationService {

    private CoffeePowderRegRepository coffeePowderRegRepository;

    public CoffeePowderRegistrationService(CoffeePowderRegRepository coffeePowderRegRepository){
        this.coffeePowderRegRepository = coffeePowderRegRepository;
    }

    public CoffeeTable saveCoffee(int weight, int coffeeRatio, int chicoryRatio, int price){
        CoffeeTable c = new CoffeeTable();
        c.setWeight(weight);
        c.setCoffeeRatio(coffeeRatio);
        c.setChicoryRatio(chicoryRatio);
        c.setPrice(price);
        return coffeePowderRegRepository.save(c);

    }
//
//    public List<CoffeeTable> getAllCoffeeProducts(){
//        return coffeePowderRegRepository.findAll();
//    }

    public Optional<List<CoffeeTable>> getAllCoffeeProducts() {
        return Optional.of(coffeePowderRegRepository.findAll());  // Assuming `findById` returns an Optional
    }
}
