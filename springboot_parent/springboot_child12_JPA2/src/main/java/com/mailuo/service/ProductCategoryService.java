package com.mailuo.service;

import com.mailuo.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
   ProductCategory findOne(Integer categoryId);

   List<ProductCategory> findAll();

   List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

   ProductCategory save(ProductCategory productCategory);

}
