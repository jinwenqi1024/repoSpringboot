package com.mailuo.service;

import com.mailuo.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {
    /**
     * 根据商品id查询一个商品
     * @param productId
     * @return
     */

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有，分页
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);


    /**
     * 保存/更新
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);
}
