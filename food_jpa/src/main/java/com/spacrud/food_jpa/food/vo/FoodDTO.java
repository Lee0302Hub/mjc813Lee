package com.spacrud.food_jpa.food.vo;


import com.spacrud.food_jpa.ingredient.vo.IngredientDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodDTO {
    private Long id;
    private String name;
    private int spicyLevel;
    private int sweetLevel;
    private int sourLevel;
    private int saltyLevel;
    private IngredientDTO ingredient;
    private FoodCategoryDTO foodCategory;
}
