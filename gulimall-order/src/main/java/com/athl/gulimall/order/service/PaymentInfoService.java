package com.athl.gulimall.couon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.athl.common.utils.PageUtils;
import com.athl.gulimall.couon.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 11:46:08
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

