package com.spacrud.spring_demo.genre.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/// DTO와 통신한다.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "GenreEntity")
@Table(name = "genre_tbl")
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String name;
}
