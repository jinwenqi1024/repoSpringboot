package com.mailuo.test;

import com.mailuo.controller.SpringController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//需要测试的目标类，即测试谁
@SpringBootTest(classes = SpringController.class)
//测试的驱动，即谁来测试
@RunWith(SpringJUnit4ClassRunner.class)
//springboot整合web
@WebAppConfiguration
public class TestSpringController {
    @Autowired
    private SpringController springController;
    @Test
    public void test1(){
        //用断言进行测试
        TestCase.assertEquals(this.springController.first(),"hello_springboot");
  }
}
