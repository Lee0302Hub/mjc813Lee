package com.examplecoop.animalex.animal.mybatis;

import com.examplecoop.animalex.animal.dto.AnimalDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalMybatisMapper {
    void insertAnimal(AnimalDTO adt);
    AnimalDTO selectAnimal(Long id);
    List<AnimalDTO> allSelAnimal();
    void delAnimal(Long id);
}
