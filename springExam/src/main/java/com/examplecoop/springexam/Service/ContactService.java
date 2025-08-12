package com.examplecoop.springexam.Service;

import com.examplecoop.springexam.Repository.ContactDTO;
import com.examplecoop.springexam.Repository.IContactMapper;
import com.examplecoop.springexam.Repository.searchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    //한번 초기화 후 불변 (final 특성)
    private final IContactMapper contactMapper;

    //Autowired로 생성자에서 한번만 주입 (이미 mybatis의 xml과 mapper로 인해 구현체가 생성)
    @Autowired
    public ContactService(IContactMapper contactMapper) {
        this.contactMapper = contactMapper;
    }

    public void inData(ContactDTO ct) {
    contactMapper.inData(ct);
    }

    public List<ContactDTO> selData(searchDTO sdt) {

        return contactMapper.selData(sdt);
    }

    public void delData(Long id) {
        contactMapper.delData(id);
    }

    public void upData(Long id, String col, String modify) {
        contactMapper.upData(id, col, modify);
    }

}
