package com.athl.gulimall.smember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.athl.common.utils.PageUtils;
import com.athl.gulimall.smember.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 11:47:26
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

