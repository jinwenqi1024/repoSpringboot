package com.mailuo.service.impl;

import com.mailuo.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryServiceImpl productCategoryService;

    @Test
    public void findOne() {
         ProductCategory productCategory = productCategoryService.findOne(1);
         //Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
        Assert.assertNotNull(productCategory);

    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
    }

    @Test
    public void save() {
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryId(5);
        productCategory.setCategoryName("番茄炒蛋");
        productCategory.setCategoryType(0);
        productCategory.setCreateTime(new Date());
        productCategory.setUpdateTime(new Date());
        ProductCategory result = productCategoryService.save(productCategory);
        Assert.assertNotEquals(null,result);

    }

}