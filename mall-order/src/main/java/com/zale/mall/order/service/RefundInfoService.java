package com.zale.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zale.common.utils.PageUtils;
import com.zale.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 03:38:15
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

