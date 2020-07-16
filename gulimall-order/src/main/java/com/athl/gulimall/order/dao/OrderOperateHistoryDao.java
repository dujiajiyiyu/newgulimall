package com.athl.gulimall.couon.dao;

import com.athl.gulimall.couon.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 11:46:08
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
