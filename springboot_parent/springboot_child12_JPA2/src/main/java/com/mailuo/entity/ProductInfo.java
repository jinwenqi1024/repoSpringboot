package com.mailuo.entity;

import com.mailuo.enums.ProductStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class ProductInfo implements Serializable {
    @Id //商品id  主键
    private String productId;
    //商品名字
    private String productName;
    //商品价格
    private BigDecimal productPrice;
    //商品库存
    private Integer productStock;
    //商品描述
    private String productDescription;
    //小图
    private String productIcon;
    //商品状态
    private Integer productStatus= ProductStatusEnum.UP.getCode();
    //类目
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
