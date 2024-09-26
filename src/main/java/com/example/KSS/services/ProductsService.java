package com.example.KSS.services;

import com.example.KSS.models.CoffeeTable;
import com.example.KSS.repositories.ProductsRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

     ProductsRepository productsRepository;

     public ProductsService(ProductsRepository productsRepository){
         this.productsRepository = productsRepository;
     }

    public List<String> getUniqueWeights() {
        return productsRepository.findDistinctWeights();
    }

    public List<String> getUniqueCoffeeRatios() {
        return productsRepository.findDistinctCoffeeRatios();
    }

    public List<String> getUniqueChicoryRatios() {
        return productsRepository.findDistinctChicoryRatios();
    }

    public int getPrice(int weight, int coffeeRatio, int chicoryRatio) {
        return productsRepository.findPriceByAttributes(weight, coffeeRatio, chicoryRatio);
    }
}
