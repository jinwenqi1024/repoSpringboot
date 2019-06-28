package com.taiping.respository;

import com.taiping.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author jinwenqi
 * @Date 10:37 2019/6/28
 * @Project SpringBoot
 * @Description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRespositoryTest {

    @Autowired
    private StudentRespository respository;

    @Test
    public void findById() {
        Student result = respository.findById("1001");
        Assert.assertNotNull(result);

    }
}