package com.twt.dao.impl;

import com.twt.controller.EmpController;
import com.twt.dao.EmpDao;
import com.twt.pojo.Emp;
import com.twt.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository //将当前类交给IOC容器管理，成为容器中的bean
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> getEmp() {
        String file = EmpController.class.getClassLoader().getResource("emp.xml").getFile();
        List<Emp> emps= XmlParserUtils.parse(file,Emp.class);
        return emps;
    }
}
