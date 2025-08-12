package com.spacrud.food_jpa.food.service;

import com.spacrud.food_jpa.food.vo.FoodCategoryDTO;
import com.spacrud.food_jpa.food.vo.FoodCategoryEntity;
import com.spacrud.food_jpa.food.vo.FoodDTO;
import com.spacrud.food_jpa.ingredient.service.IngredientRepository;
import com.spacrud.food_jpa.ingredient.service.IngredientService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Builder
public class FoodService {
    @Autowired
    private FoodRepository fr;
    @Autowired
    private FoodCategoryRepository fcr;
    @Autowired
    private IngredientService iService;

    public void insertAll(FoodDTO fdto) {
    
    }

}
