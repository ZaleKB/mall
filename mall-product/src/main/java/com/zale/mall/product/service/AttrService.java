package com.zale.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zale.common.utils.PageUtils;
import com.zale.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 00:53:44
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

