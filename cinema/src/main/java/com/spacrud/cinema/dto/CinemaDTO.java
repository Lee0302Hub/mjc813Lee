package com.spacrud.cinema.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CinemaDTO {
    private Integer id;
    private String name;
    private Integer genreId;
    private String playTime;
    private String casts;
    private String description;
    private Integer restrictAge;
}
