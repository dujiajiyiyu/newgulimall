package com.athl.gulimall.coupon.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author hl
 * @Data 2020/7/16
 */
@FeignClient(name = "gulimall-member")
public interface memberFeignClient {

}
