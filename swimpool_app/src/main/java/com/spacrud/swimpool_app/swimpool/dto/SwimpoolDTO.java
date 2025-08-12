package com.spacrud.swimpool_app.swimpool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwimpoolDTO {
    private Integer id;
    private String name;
    private Integer lanes;
    private String lanesType;
    private String phoneNumber;
    private String addr;
}
