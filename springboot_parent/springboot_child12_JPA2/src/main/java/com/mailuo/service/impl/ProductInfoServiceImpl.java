package com.mailuo.service.impl;

import com.mailuo.dao.ProductInfoRepository;
import com.mailuo.entity.ProductInfo;
import com.mailuo.enums.ProductStatusEnum;
import com.mailuo.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository repository;


    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
