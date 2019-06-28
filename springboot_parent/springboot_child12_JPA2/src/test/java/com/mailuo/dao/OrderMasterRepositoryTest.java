package com.mailuo.dao;

import com.mailuo.entity.OrderMaster;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "110110";


    @Test
    public void testSave() {
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setBuyerAddress("上海");
        orderMaster.setBuyerName("师弟");
        orderMaster.setBuyerOpenid("110112");
        orderMaster.setBuyerPhone("123456789111");
        orderMaster.setCreateTime(new Date());
        orderMaster.setOrderAmount(new BigDecimal(3.5));
        orderMaster.setOrderStatus(0);
        orderMaster.setPayStatus(0);
        orderMaster.setUpdateTime(new Date());
        orderMaster.setOrderId("1234567");
        /**
         * buyer_address, buyer_name, buyer_openid, buyer_phone, create_time,
         * order_amount, order_status, pay_status, update_time, order_id
         */
        OrderMaster result=repository.save(orderMaster);
        Assert.assertNotNull(result);


    }


    @Test
    public void findByBuyOpenId() {
        Pageable pageable=new PageRequest(0,2);
        Page<OrderMaster> page = repository.findByBuyerOpenid(OPENID, pageable);
        System.out.println(page.toString());
        Assert.assertNotNull(page.getTotalElements());



    }
}