package com.twt;

import com.twt.mapper.EmpMapper;
import com.twt.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete(){
        empMapper.delete(17);
    }

    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setUsername("天暗星");
        emp.setName("李星云");
        emp.setImage( "1.jpg" );
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntryDate(LocalDate.of(2000, 1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1) ;
        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setId(10);
        emp.setUsername("玉骑士");
        emp.setName("李素裳");
        emp.setImage( "2.jpg" );
        emp.setGender((short)2);
        emp.setJob((short)1);
        empMapper.update(emp);
    }

    @Test
    public void testGetById(){
        Emp emp = empMapper.getById(1);
        System.out.println(emp);
    }

    @Test
    public void testList(){
        List<Emp> empList = empMapper.list(null,(short)1,null,null);
        System.out.println(empList);
    }
    @Test
    public void testDeleteByIds(){
        List<Integer> ids = new ArrayList<>();
        ids.add(12);
        ids.add(13);
        ids.add(14);
        empMapper.deleteByIds(ids);
    }
}
