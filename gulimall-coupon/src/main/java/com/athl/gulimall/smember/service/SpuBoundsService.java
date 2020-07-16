package com.athl.gulimall.smember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.athl.common.utils.PageUtils;
import com.athl.gulimall.smember.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 11:47:26
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

