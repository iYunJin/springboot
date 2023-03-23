package com.twt.controller;


import com.twt.pojo.Result;
import com.twt.service.EmpService;
import com.twt.service.impl.EmpServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired //运行时，IOC容器会提供该类型的bean对象
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result getEmp(){
        return Result.success(empService.listEmp());
    }

}
