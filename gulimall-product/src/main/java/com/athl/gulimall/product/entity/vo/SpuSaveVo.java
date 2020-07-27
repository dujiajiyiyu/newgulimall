/**
 * Copyright 2020 bejson.com
 */
package com.athl.gulimall.product.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-07-27 22:16:54
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class SpuSaveVo {

    private String spuName;
    private String spuDescription;
    private int catalogId;
    private int brandId;
    private double weight;
    private int publishStatus;
    private List<String> decript;
    private List<String> images;
    private Bounds bounds;
    private List<BaseAttrs> baseAttrs;
    private List<Skus> skus;
}