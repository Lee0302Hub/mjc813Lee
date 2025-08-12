package com.examplecoop.springexam.Repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IContactMapper {
    void inData(ContactDTO ct);
    List<ContactDTO> selData(searchDTO sdt);
    void delData(Long id);
    void upData(Long id, String col, String modify);
}
