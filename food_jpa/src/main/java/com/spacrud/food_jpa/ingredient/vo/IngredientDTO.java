package com.spacrud.food_jpa.ingredient.vo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IngredientDTO {
    private Long id;
    private String name;
    private IngredientCategoryDTO ingredientCategory;
}
