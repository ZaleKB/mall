package com.zale.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zale.common.utils.PageUtils;
import com.zale.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 03:28:46
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

