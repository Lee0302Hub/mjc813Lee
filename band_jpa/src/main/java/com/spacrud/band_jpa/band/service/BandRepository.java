package com.spacrud.band_jpa.band.service;

import com.spacrud.band_jpa.band.vo.BandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "band")
public interface BandRepository extends JpaRepository<BandEntity, Long> {
}
