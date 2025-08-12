package com.spacrud.food_jpa.ingredient.service;

import com.spacrud.food_jpa.ingredient.vo.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "api_ingredient")
public interface IngredientRepository extends JpaRepository<IngredientEntity, Long> {
}
