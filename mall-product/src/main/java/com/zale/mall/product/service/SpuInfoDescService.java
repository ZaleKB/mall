package com.zale.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zale.common.utils.PageUtils;
import com.zale.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 00:53:44
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

