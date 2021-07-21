package com.zale.mall.order.dao;

import com.zale.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 03:38:15
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
