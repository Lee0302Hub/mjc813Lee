package com.spacrud.food_jpa.food.vo;

import com.spacrud.food_jpa.ingredient.vo.IngredientCategoryDTO;
import com.spacrud.food_jpa.ingredient.vo.IngredientEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "food_tbl")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 35)
    private String name;
    @Column(nullable = false, length = 5)
    private int sweetLevel;
    @Column(nullable = false, length = 5)
    private int sourLevel;
    @Column(nullable = false, length = 5)
    private int saltyLevel;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private IngredientEntity ingredient;

    @ManyToOne
    @JoinColumn(name = "food_category_id")
    private FoodCategoryEntity foodCategory;

}
