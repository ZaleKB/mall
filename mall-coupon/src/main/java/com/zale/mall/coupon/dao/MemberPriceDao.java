package com.zale.mall.coupon.dao;

import com.zale.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 03:17:35
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
