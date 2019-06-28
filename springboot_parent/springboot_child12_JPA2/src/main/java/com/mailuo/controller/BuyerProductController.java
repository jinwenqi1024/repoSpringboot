package com.mailuo.controller;

import com.mailuo.VO.ProductInfoVO;
import com.mailuo.VO.ProductVO;
import com.mailuo.VO.ResultVO;
import com.mailuo.entity.ProductCategory;
import com.mailuo.entity.ProductInfo;
import com.mailuo.service.ProductCategoryService;
import com.mailuo.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping("/list")
    public ResultVO getList(){


        //1.查询所有在架的商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //2.查询在架商品所在的类目
        List<Integer> categoryTypeList=new ArrayList<Integer>();
        for (ProductInfo productInfo : productInfoList) {
            categoryTypeList.add(productInfo.getCategoryType());

        }
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        //3.数据拼装
        //构建商品集合
        List<ProductVO> productVOList= new ArrayList<ProductVO>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO=new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());


            List<ProductInfoVO> productInfoVOList=new ArrayList<ProductInfoVO>();//商品详情集合

            for (ProductInfo productInfo : productInfoList) {

                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO=new ProductInfoVO();
                    //将后端商品详情对象属性copy到前端VO对象中，无需一一set
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }

            }
            productVO.setProductInfoVOList(productInfoVOList);

            productVOList.add(productVO);

        }
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(productVOList);
        resultVO.setMessage("成功！");


        return resultVO;
    }
}
