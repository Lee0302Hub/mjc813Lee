package com.spacrud.swimpool_app.swimpool.apicontroller;

import com.spacrud.swimpool_app.swimpool.common.ResponseDTO;
import com.spacrud.swimpool_app.swimpool.common.ResponseEnum;
import com.spacrud.swimpool_app.swimpool.dto.SwimpoolDTO;
import com.spacrud.swimpool_app.swimpool.service.SwimpoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/swimpool")
public class SwimpoolApiController {
    @Autowired
    private SwimpoolService swService;

    @GetMapping("/list")
    public ResponseEntity<ResponseDTO> list() {
        try {
            List<SwimpoolDTO> list = swService.findAll();
            return ResponseEntity.ok().body(new ResponseDTO(ResponseEnum.Success, "OK", list));

        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(new ResponseDTO(ResponseEnum.SelFail, "Select Method Fail", e));
        }
    }
    @PostMapping("")
    public ResponseEntity<ResponseDTO> insert(@RequestBody SwimpoolDTO swDTO) {
        try{

            return ResponseEntity.ok().body(new ResponseDTO(ResponseEnum.Success, "OK", swService.insert(swDTO)));

        }catch(Throwable e) {
            return ResponseEntity.status(500).body(new ResponseDTO(ResponseEnum.InsFail, "Insert Error", e));
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> delete(@PathVariable("id") Integer id) {
        try{
            swService.delete(id);
            return ResponseEntity.ok().body(new ResponseDTO(ResponseEnum.Success, "OK", true));
        }catch(Throwable e) {
            return ResponseEntity.status(500).body(new ResponseDTO(ResponseEnum.DelFail, "Delete Fail Error", e));
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDTO> update(@PathVariable("id") Integer id, @RequestBody SwimpoolDTO swDTO) {
        try{
            swDTO.setId(id);
            swService.update(swDTO);
            return ResponseEntity.ok().body(new ResponseDTO(ResponseEnum.Success, "OK", true));
        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(new ResponseDTO(ResponseEnum.ModFail, "Update Fail", e));

        }
    }
}
