package com.zale.mall.product.dao;

import com.zale.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 00:53:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
