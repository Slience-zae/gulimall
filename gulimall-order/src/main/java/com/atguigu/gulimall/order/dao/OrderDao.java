package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zangchuanlei
 * @email zae_zangchuanlei@163.com
 * @date 2020-08-07 16:01:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
