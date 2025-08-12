package com.spacrud.cinema_jpa.service;

import com.spacrud.cinema_jpa.dto.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "genre2")
public interface GenreRepository extends JpaRepository<GenreEntity, Long> { ///@Entity 어노테이션이 붙은 클래스만 적용가능
}
