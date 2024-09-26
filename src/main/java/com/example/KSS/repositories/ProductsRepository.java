package com.example.KSS.repositories;

import com.example.KSS.models.CoffeeTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsRepository extends JpaRepository<CoffeeTable, Long> {

    @Query("SELECT DISTINCT c.weight FROM CoffeeTable c")
    List<String> findDistinctWeights();

    @Query("SELECT DISTINCT c.coffeeRatio FROM CoffeeTable c")
    List<String> findDistinctCoffeeRatios();

    @Query("SELECT DISTINCT c.chicoryRatio FROM CoffeeTable c")
    List<String> findDistinctChicoryRatios();

    @Query("SELECT c.price FROM CoffeeTable c WHERE c.weight = :weight AND c.coffeeRatio = :coffeeRatio AND c.chicoryRatio = :chicoryRatio")
    int findPriceByAttributes(@Param("weight") int weight, @Param("coffeeRatio") int coffeeRatio, @Param("chicoryRatio") int chicoryRatio);
}
