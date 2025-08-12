package com.spacrud.band_jpa.band;

import com.spacrud.band_jpa.band.service.BandRepository;
import com.spacrud.band_jpa.band.vo.BandEntity;
import com.spacrud.band_jpa.common.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BandRestController {
    @Autowired
    private BandRepository bre;

    @PostMapping("")
    public ResponseEntity<ResponseDTO> insert(@Validated @RequestBody BandEntity obj) {
        try{
            this.bre.save(obj);
            return ResponseEntity.status(200).body(ResponseDTO.builder().code(0).message("OK").data(obj).build());
        }catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(ResponseDTO.builder().code(-1).message("Fail").data(obj).build());
        }
    }
}
