package com.company.emp;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {

    @Autowired
    SqlSessionTemplate template;

    public String empSelect() {
        String result = template.selectOne("EmpMapper.empSelect");
        return result;
    }
}
