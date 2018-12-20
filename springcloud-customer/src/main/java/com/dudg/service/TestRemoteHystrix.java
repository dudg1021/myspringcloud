package com.dudg.service;

import org.springframework.stereotype.Component;

@Component
public class TestRemoteHystrix implements TestRemote {
    @Override
    public String test() {
        return "Hystrix 熔断成功 调用fallback 返回！";
    }
}
