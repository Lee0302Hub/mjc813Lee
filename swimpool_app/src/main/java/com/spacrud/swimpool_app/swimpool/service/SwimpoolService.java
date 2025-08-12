package com.spacrud.swimpool_app.swimpool.service;

import com.spacrud.swimpool_app.swimpool.dto.SwimpoolDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwimpoolService {
    @Autowired
    private SwimpoolMapper swmapper;

    public List<SwimpoolDTO> findAll() {
        return swmapper.findAll();
    }

    public SwimpoolDTO insert(SwimpoolDTO swDTO) {
        swmapper.insert(swDTO);
        return swDTO;
    }

    public void delete(Integer id){
        swmapper.delete(id);

    }

    public void update(SwimpoolDTO swDTO) {
        swmapper.update(swDTO);
    }
}
