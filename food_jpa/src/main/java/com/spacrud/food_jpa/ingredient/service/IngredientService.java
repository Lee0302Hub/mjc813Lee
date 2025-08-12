package com.spacrud.food_jpa.ingredient.service;

import com.spacrud.food_jpa.ingredient.vo.IngredientCategoryDTO;
import com.spacrud.food_jpa.ingredient.vo.IngredientCategoryEntity;
import com.spacrud.food_jpa.ingredient.vo.IngredientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ir;
    @Autowired
    private IngredientCategoryRepository icr;
    public void insertIngredient(Long ingredientId, Long ingredientCategoryId) {

    }
}
