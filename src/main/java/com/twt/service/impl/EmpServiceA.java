package com.twt.service.impl;

import com.twt.dao.EmpDao;
import com.twt.dao.impl.EmpDaoA;
import com.twt.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //将当前类交给IOC容器管理，成为容器中的bean
public class EmpServiceA implements com.twt.service.EmpService {


    @Autowired //运行时，IOC容器会提供该类型的bean对象
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.getEmp();

        for (Emp emp :empList){
            if("1".equals(emp.getGender()))
                emp.setGender("男");
            else
                emp.setGender("女");

            if("1".equals(emp.getJob()))
                emp.setJob("讲师");
            else if ("2".equals(emp.getJob()))
                emp.setJob("班主任");
            else
                emp.setJob("就业指导");
        }
        return empList;
    }
}
