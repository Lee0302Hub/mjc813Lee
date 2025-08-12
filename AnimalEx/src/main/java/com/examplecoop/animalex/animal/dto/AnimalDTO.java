package com.examplecoop.animalex.animal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnimalDTO {
    private Long id;
    private String name;
    private Integer age;
    private String kind;
}
