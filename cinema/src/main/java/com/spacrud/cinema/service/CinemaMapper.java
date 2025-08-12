package com.spacrud.cinema.service;

import com.spacrud.cinema.dto.CinemaDTO;
import com.spacrud.cinema.dto.GenreDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CinemaMapper {
    void cinemaInsert(CinemaDTO cdt,@Param("genre") String genre);
    GenreDTO genreSelect(String genre);
    void genreInsert(GenreDTO gto);
}
