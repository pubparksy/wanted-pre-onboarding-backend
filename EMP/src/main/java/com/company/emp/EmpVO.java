package com.company.emp;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("EmpVO")
@Data
public class EmpVO {

    private String noticeId;
    private String comId;
    private String comNm;
    private String position;
    private int bonus;
    private String info;
    private String skill;
    private String nation;
    private String locatioin;
    private String subNotice;
    private String userId;

}
