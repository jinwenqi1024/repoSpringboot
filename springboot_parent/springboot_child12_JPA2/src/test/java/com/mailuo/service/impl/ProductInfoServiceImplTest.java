package com.mailuo.service.impl;

import com.mailuo.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findOne() {
        ProductInfo one = productInfoService.findOne("1");
        Assert.assertEquals("1",one.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> result = productInfoService.findUpAll();
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void findAll() {
        PageRequest request=new PageRequest(1,2);
        Page<ProductInfo> page = productInfoService.findAll(request);
        Assert.assertNotNull(page);
    }

    @Test
    public void save() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("10");
        productInfo.setCategoryType(0);
        productInfo.setProductDescription("好好吃");
        productInfo.setProductName("炸鸡");
        productInfo.setProductIcon("http://wwww.xxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setProductPrice(new BigDecimal(10.5));
        productInfo.setProductStock(150);
        productInfo.setCreateTime(new Date());
        productInfo.setUpdateTime(new Date());
        ProductInfo info = productInfoService.save(productInfo);
        Assert.assertNotNull(info);
    }
}