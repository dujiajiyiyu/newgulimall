package com.athl.gulimall.product.controller;

import com.athl.common.utils.PageUtils;
import com.athl.common.utils.R;
import com.athl.gulimall.product.entity.AttrGroupEntity;
import com.athl.gulimall.product.service.AttrGroupService;
import com.athl.gulimall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 属性分组
 *
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 15:28:09
 */
@Slf4j
@RestController
@RequestMapping("product/attrgroup")
public class AttrGroupController {
    @Autowired
    private AttrGroupService attrGroupService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = attrGroupService.queryPage(params);
        return R.ok().put("page", page);
    }

    /**
     * @param params
     * @return
     */
    @GetMapping("/list/{catelogId}")
    public R list(@RequestParam Map<String, Object> params,
                  @PathVariable("catelogId") Long catelogId) {
        PageUtils queryPage = attrGroupService.queryPageByCid(params, catelogId);
        return R.ok().put("page", queryPage);
    }

    /**
     * 信息
     */
    @GetMapping("/info/{attrGroupId}")
    public R info(@PathVariable("attrGroupId") Long attrGroupId) {
        AttrGroupEntity attrGroup = attrGroupService.getById(attrGroupId);
        Long catelogId = attrGroup.getCatelogId();
        Long[] categoryPath = categoryService.findCategoryPath(catelogId);
        attrGroup.setCatelogPath(categoryPath);
        log.info("分组信息为==========" + attrGroup);
        return R.ok().put("attrGroup", attrGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrGroupEntity attrGroup) {
        attrGroupService.save(attrGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrGroupEntity attrGroup) {
        attrGroupService.updateById(attrGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] attrGroupIds) {
        attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return R.ok();
    }

}
