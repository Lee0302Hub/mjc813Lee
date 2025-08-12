package com.spacrud.food_jpa.food.service;

import com.spacrud.food_jpa.food.vo.FoodEntity;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "api_Food")
public interface FoodRepository extends JpaRepository<FoodEntity, Long> {
}

