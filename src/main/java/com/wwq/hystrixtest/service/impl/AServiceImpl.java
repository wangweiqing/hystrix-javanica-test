package com.wwq.hystrixtest.service.impl;

import com.wwq.hystrixtest.client.AClient;
import com.wwq.hystrixtest.service.AService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangweiqing
 * @version 1.0
 * @Description:
 * @Date 16/7/12
 */
@Service("aService")
public class AServiceImpl implements AService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AServiceImpl.class);
    @Resource
    private AClient aClient;

    @Override
    public String getTest() {
        LOGGER.info("Hystrix test start!");
        return aClient.getTest(1);
    }
}
