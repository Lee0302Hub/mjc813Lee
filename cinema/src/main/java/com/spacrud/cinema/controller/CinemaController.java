package com.spacrud.cinema.controller;

import com.spacrud.cinema.common.ResponseDTO;
import com.spacrud.cinema.dto.CinemaDTO;
import com.spacrud.cinema.service.CinemaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/cinema")
public class CinemaController {
    @Autowired
    private CinemaService cService;

    @PostMapping("/insert/{genre}")
    public ResponseEntity<ResponseDTO> insert(@RequestBody CinemaDTO cdt, @PathVariable("genre") String genre) {
        try {
            this.cService.cinemaInsert(cdt, genre);
            return ResponseEntity.ok(new ResponseDTO("OK", "Success", cdt));
        }catch(Throwable e) {
            return ResponseEntity.status(500).body(new ResponseDTO("Fail", "Insert Method Error", cdt));
        }
    }
}
