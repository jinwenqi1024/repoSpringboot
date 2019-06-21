package com.mailuo.service;

import com.github.pagehelper.PageHelper;
import com.mailuo.mapper.UserMapper;
import com.mailuo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

   @Transactional
    public List<User> query(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.queryUser();
        return users;
    }

    @Cacheable(value = "myname")
    public User findByName(String username) {
        System.out.println("从数据库中查询……");
        return userMapper.findByName(username);
    }
}
