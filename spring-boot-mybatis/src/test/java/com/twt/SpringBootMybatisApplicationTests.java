package com.twt;

import com.twt.mapper.UserMapper;
import com.twt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.getUsers();
        users.stream().forEach(user -> {
            System.out.println(user);
        });
    }

}
