package com.dudg.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-server",fallback = TestRemoteHystrix.class)
public interface TestRemote {

    @RequestMapping("/test")
    public String test();
}
