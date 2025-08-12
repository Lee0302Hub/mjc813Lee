package com.examplecoop.springexam.Repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
    private long id;
    private String name;
    private String phoneNumber;
    private String zipNumber;
    private String email;
}
