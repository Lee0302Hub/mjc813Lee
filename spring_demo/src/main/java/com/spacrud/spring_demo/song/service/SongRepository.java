package com.spacrud.spring_demo.song.service;

import com.spacrud.spring_demo.song.dto.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<SongEntity, Long> {
}
