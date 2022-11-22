package com.seamew.mapper;

import com.seamew.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper
{
    User getUserById(@Param("id") Integer id);


    List<User> getAllUsers();
}
