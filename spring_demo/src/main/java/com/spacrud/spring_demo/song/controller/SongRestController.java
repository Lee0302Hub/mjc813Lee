package com.spacrud.spring_demo.song.controller;

import com.spacrud.spring_demo.common.ResponseDTO;
import com.spacrud.spring_demo.song.dto.SongEntity;
import com.spacrud.spring_demo.song.service.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/song")
public class SongRestController {
    @Autowired
    private SongRepository res;

    @PostMapping("")
    public ResponseEntity<ResponseDTO> insert(@RequestBody SongEntity entity) {
        try {
            this.res.save(entity);
            return ResponseEntity.ok().body(ResponseDTO.builder().
                    resultCode(200).msg("Success").resultData(entity).build());
        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDTO.builder().resultCode(500).msg("Insert Fail").resultData(entity).build()
            );
        }
    }

}
