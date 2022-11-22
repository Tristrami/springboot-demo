package com.seamew.test;

import com.seamew.SpringbootMybatisApplication;
import com.seamew.domain.User;
import com.seamew.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = SpringbootMybatisApplication.class)
@Slf4j
public class UserMapperTest
{
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetUserById()
    {
        Integer id = 1;
        User user = userMapper.getUserById(id);
        log.info("The user is [{}]", user);
    }

    @Test
    public void testGetAllUsers()
    {
        List<User> users = userMapper.getAllUsers();
        log.info("The user is [{}]", users);
    }
}
