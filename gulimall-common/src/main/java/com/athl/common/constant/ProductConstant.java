package com.athl.common.constant;

import lombok.Getter;

/**
 * @author hl
 * @Data 2020/7/26
 */
public class ProductConstant {
    @Getter
    public enum AttrEnum {

        ATTR_TYPE_BASE(1, "基本属性"), ATTR_TYPE_SALE(0, "销售属性");
        private int code;
        private String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }
}
