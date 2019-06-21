package com.mailuo.mapper;

import com.mailuo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> queryUser();

    @Insert("insert into user (username,password) values (#{username},#{password})")
    void addUser(@Param("username") String username, @Param("password") String password);
}
