package com.mailuo.repostory;

import com.mailuo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepostory extends JpaRepository<User,Integer> {

    /**
     * @param id 根据id获取当前user数据
     * @return user
     */
    User findAllById(Integer id);
    /**
     * 通过用户名和密码来获取用户
     * @param username 参数用户名
     * @param password 参数密码
     * @return 返回user
     */
    User findAllByUsernameAndPassword(String username, String password);
    /**
     * 模糊查询 自定义查询语句
     * @param username
     * @return
     */
    @Query(value = "select * from user u where u.username like %:username%",nativeQuery=true)
    List<User> findAllByUsername(@Param("username") String username);

}

