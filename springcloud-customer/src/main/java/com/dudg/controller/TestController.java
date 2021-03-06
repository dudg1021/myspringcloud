package com.dudg.controller;

import com.dudg.service.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestRemote testRemote;

    @GetMapping("/test")
    public String test(){
        return testRemote.test();
    }
}
