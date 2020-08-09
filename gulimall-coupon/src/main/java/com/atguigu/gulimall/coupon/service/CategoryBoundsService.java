package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.CategoryBoundsEntity;

import java.util.Map;

/**
 * 商品分类积分设置
 *
 * @author zangchuanlei
 * @email zae_zangchuanlei@163.com
 * @date 2020-08-07 15:15:48
 */
public interface CategoryBoundsService extends IService<CategoryBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

