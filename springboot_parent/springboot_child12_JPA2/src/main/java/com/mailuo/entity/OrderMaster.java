package com.mailuo.entity;

import com.mailuo.enums.OrderStatusEnum;
import com.mailuo.enums.PayStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class OrderMaster {

    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    /**买家微信Openid*/
    private String buyerOpenid;

    private BigDecimal orderAmount;

    //默认为新下单状态
    private Integer orderStatus=OrderStatusEnum.NEW.getCode();

    //默认为未支付状态
    private Integer payStatus= PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;
}
