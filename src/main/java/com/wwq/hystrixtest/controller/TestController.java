package com.wwq.hystrixtest.controller;

import com.wwq.hystrixtest.service.AService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangweiqing
 * @version 1.0
 * @Description:
 * @Date 16/7/12
 */
@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Resource
    private AService aService;
    @RequestMapping("/test")
    public String test(){
        aService.getTest();
        return "Success";
    }
}
