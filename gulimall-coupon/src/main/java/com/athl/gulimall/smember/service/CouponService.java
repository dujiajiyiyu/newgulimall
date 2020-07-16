package com.athl.gulimall.smember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.athl.common.utils.PageUtils;
import com.athl.gulimall.smember.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 11:47:26
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

