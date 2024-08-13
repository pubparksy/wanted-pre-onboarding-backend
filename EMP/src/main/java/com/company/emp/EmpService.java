package com.company.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    EmpDAO dao;

    public String empSelect() {
        return dao.empSelect();
    }
}
