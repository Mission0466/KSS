package com.example.KSS.repositories;

import com.example.KSS.models.CoffeeTable;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeePowderRegRepository extends JpaRepository<CoffeeTable, Long> {
}
