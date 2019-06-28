package com.mailuo.dao;

import com.mailuo.entity.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void testSave(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setOrderId("111111111");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("111112");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(3);
        orderDetail.setDetailId("1234567810");
        orderDetail.setCreateTime(new Date());
        orderDetail.setUpdateTime(new Date());

        /**
         * (order_id, product_icon, product_id, product_name,
         * product_price, product_quantity, detail_id) values (?, ?, ?, ?, ?, ?, ?)
         */
        OrderDetail result=repository.save(orderDetail);
        Assert.assertNotNull(result);


    }

    @Test
    public void findByOrderId() {
        //repository.findByOrderId()
        List<OrderDetail> result = repository.findByOrderId("222222222");
        //System.out.println("result = " + result);
        log.info("result",result);
        Assert.assertNotNull(result);

    }
}