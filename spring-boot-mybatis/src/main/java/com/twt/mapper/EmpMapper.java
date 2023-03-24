package com.twt.mapper;


import com.twt.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface EmpMapper {

    //根据id删除数据
    @Delete("delete from emp where id = #{id}")
    int delete(Integer id);
    void deleteByIds(List<Integer> ids);
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username,name,gender,image,job,entrydate,dept_id,create_time,update_time)"+
            "values (#{username},#{name},#{gender},#{image},#{job},#{entryDate},#{deptId},#{createTime},#{updateTime});")
    void insert(Emp emp);


    void update(Emp emp);

    @Results({
            @Result(column = "dept_id",property = "deptId"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "update_time",property = "updateTime")
    })
    @Select("select * from emp where id = #{id}")
    Emp getById(Integer id);

//    @Select("select * from emp where name like '%${name}%' and gender=#{gender} and"+
//            " entrydate between #{begin} and #{end} order by update_time desc")
//    List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
}
