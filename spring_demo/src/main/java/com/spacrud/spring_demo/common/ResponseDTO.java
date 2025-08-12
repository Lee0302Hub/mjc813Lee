package com.spacrud.spring_demo.common;

import jakarta.persistence.GeneratedValue;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseDTO {
    private Integer resultCode;
    private String msg;
    private Object resultData;
}
