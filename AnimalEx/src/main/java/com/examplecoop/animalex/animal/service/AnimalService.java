package com.examplecoop.animalex.animal.service;

import com.examplecoop.animalex.animal.dto.AnimalDTO;
import com.examplecoop.animalex.animal.mybatis.AnimalMybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalMybatisMapper ambp;

    @Autowired
    public AnimalService(AnimalMybatisMapper ambp) {
        this.ambp = ambp;
    }

    public void insertAnimal(AnimalDTO adt) {
        ambp.insertAnimal(adt);
    }

    public AnimalDTO selectAnimal(Long id) {

            return ambp.selectAnimal(id);

    }

    public List<AnimalDTO> allSelAnimal() {
        return ambp.allSelAnimal();
    }

    public void delAnimal(Long id) {
        ambp.delAnimal(id);
    }

}
