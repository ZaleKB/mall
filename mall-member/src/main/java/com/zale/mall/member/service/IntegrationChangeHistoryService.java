package com.zale.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zale.common.utils.PageUtils;
import com.zale.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 03:28:46
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

