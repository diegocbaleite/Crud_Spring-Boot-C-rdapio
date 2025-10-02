package com.example.cardapio.repository;

import com.example.cardapio.model.Food;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
