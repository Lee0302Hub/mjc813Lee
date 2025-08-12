package com.spacrud.cinema.service;

import com.spacrud.cinema.dto.CinemaDTO;
import com.spacrud.cinema.dto.GenreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaService {
    private final CinemaMapper cMapper;

    @Autowired
    public CinemaService(CinemaMapper cMapper) {
        this.cMapper = cMapper;
    }

    public void cinemaInsert(CinemaDTO cdt, String genre) {
        GenreDTO gto = this.cMapper.genreSelect(genre);
        if(gto == null) {
            GenreDTO genDTO = new GenreDTO();
            genDTO.setName(genre);
            this.cMapper.genreInsert(genDTO);
        }
        this.cMapper.cinemaInsert(cdt, genre);
    }
}
