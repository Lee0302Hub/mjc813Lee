package com.spacrud.spring_demo.genre.service;

import com.spacrud.spring_demo.genre.dto.GenreEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/// 자동으로 CRUD를 생성시켜주는 역할을 한다.
@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
    Page<GenreEntity> findByNameContains(String name, Pageable pageable);
}
