package com.mailuo.service.impl;

import com.mailuo.dao.OrderDetailRepository;
import com.mailuo.dao.OrderMasterRepository;
import com.mailuo.dto.OrderDTO;
import com.mailuo.entity.OrderDetail;
import com.mailuo.entity.OrderMaster;
import com.mailuo.entity.ProductInfo;
import com.mailuo.enums.ResultEnum;
import com.mailuo.exception.SellException;
import com.mailuo.service.OrderService;
import com.mailuo.service.ProductInfoService;
import com.mailuo.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository detailRepository;

    @Autowired
    private OrderMasterRepository masterRepository;

    @Autowired
    private ProductInfoService productInfoService;

    @Transactional
    public OrderDTO create(OrderDTO orderDTO) {

        String orderId = KeyUtil.getUniqueKey();

        BigDecimal orderAmount=new BigDecimal(0);

        //查询订单
        List<OrderDetail> orderDetailList = orderDTO.getOrderDetailList();
        for (OrderDetail orderDetail : orderDetailList) {
            String productId = orderDetail.getProductId();
            ProductInfo productInfo = productInfoService.findOne(productId);
            if(productId==null){
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIT);
            }
            //计算订单总价
            orderAmount=productInfo.getProductPrice().multiply(BigDecimal.valueOf(orderDetail.getProductQuantity())).add(orderAmount);
            //订单详情入库
            orderDetail.setOrderId(orderId);
            orderDetail.setDetailId(KeyUtil.getUniqueKey());
            BeanUtils.copyProperties(productInfo,orderDetail);
            detailRepository.save(orderDetail);

        }

        //订单入库  orderDetail 和 orderMaster
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId(orderId);
        BeanUtils.copyProperties(orderDTO,orderMaster);

        //扣除库存
        return null;
    }

    public OrderDTO findOne(String orderId) {
        return null;
    }

    public List<OrderDTO> findOrderList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
