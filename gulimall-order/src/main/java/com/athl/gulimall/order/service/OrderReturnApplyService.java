package com.athl.gulimall.couon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.athl.common.utils.PageUtils;
import com.athl.gulimall.couon.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 11:46:08
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

