package com.spacrud.food_jpa.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDTO {
    private String message;
    private Integer resultCode;
    private Object data;

}
