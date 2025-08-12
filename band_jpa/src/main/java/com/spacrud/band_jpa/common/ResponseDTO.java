package com.spacrud.band_jpa.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDTO {
    private Integer code;
    private String message;
    private Object data;
}
