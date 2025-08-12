package com.spacrud.swimpool_app.swimpool.service;

import com.spacrud.swimpool_app.swimpool.dto.SwimpoolDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SwimpoolMapper {
    List<SwimpoolDTO> findAll();
    void insert(SwimpoolDTO swDTO);
    void delete(Integer id);
    void update(SwimpoolDTO swDTO);
}
