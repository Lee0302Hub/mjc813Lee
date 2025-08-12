package com.spacrud.spring_demo.song.dto;

import com.spacrud.spring_demo.genre.dto.GenreEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SongEntity")
@Table(name = "song_tbl")
public class SongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String title;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    private GenreEntity genre;

    @Column(nullable = false, length = 50)
    private String composer;

    @Column(nullable = false, length = 50)
    private String artist;

    private LocalDate releaseDate;

}
