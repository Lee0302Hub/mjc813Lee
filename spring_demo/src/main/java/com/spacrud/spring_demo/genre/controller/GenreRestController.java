package com.spacrud.spring_demo.genre.controller;

import com.spacrud.spring_demo.genre.dto.GenreEntity;
import com.spacrud.spring_demo.genre.service.GenreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/genre")
public class GenreRestController {
    @Autowired
    private GenreRepository res;

    @PostMapping("")
    public ResponseEntity<GenreEntity> insert(@RequestBody GenreEntity entity) {
        try{
            this.res.save(entity);
            return ResponseEntity.ok().body(entity);
        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(entity);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<GenreEntity> update(@RequestBody GenreEntity entity) {
        try{
            this.res.save(entity);
            return ResponseEntity.ok().body(entity);
        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(entity);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        try{
            this.res.deleteById(id);
            return ResponseEntity.ok().body(id);
        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenreEntity> select(@PathVariable Long id) {
        try{
            Optional<GenreEntity> sel = this.res.findById(id);
            if(sel.isPresent()) {
                return ResponseEntity.ok().body(sel.orElse(null));
            } else {
                return ResponseEntity.notFound().build();
            }
        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("")
    public ResponseEntity<Page<GenreEntity>> findByNameContains(@RequestParam String name, Pageable page) {
        try{
            Page<GenreEntity> byNameContains = this.res.findByNameContains(name, page);
            return ResponseEntity.ok().body(byNameContains);
        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(null);
        }
    }

}
