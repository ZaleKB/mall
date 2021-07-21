package com.zale.mall.member.dao;

import com.zale.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author JunweiZhang
 * @email zhangjw248@gmail.com
 * @date 2021-05-28 03:28:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
