package com.twt.controller;

import com.twt.pojo.Address;
import com.twt.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

    @RequestMapping("/hi")
    public Result hello(){
        System.out.println("hi!");
        return Result.success("hi");
    }
    @RequestMapping("/getAddress")
    public Result getAddress(){
        Address address = new Address();
        address.setCity("杭州");
        address.setProvince("浙江");
        return Result.success(address);
    }

    @RequestMapping("/getList")
    public Result getList(){
        List<Address> list =new ArrayList<>();
        Address address1 = new Address();
        Address address2 = new Address();
        address1.setCity("杭州");
        address2.setCity("成都");
        address1.setProvince("浙江");
        address2.setProvince("四川");
        list.add(address1);
        list.add(address2);
        return Result.success(list);
    }


}
