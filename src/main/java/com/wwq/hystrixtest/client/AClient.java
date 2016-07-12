package com.wwq.hystrixtest.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author wangweiqing
 * @version 1.0
 * @Description:
 * @Date 16/7/12
 */
@Component
public class AClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(AClient.class);
    @CacheResult
    @HystrixCommand(groupKey = "AClient", commandKey = "getTest", fallbackMethod = "getTestFallback")
    public String getTest(int i){
        LOGGER.info("Hystrix Get Test");
        return "Hello";
    }

    public String getTestFallback(int i){
        LOGGER.info("Hystrix Get Test Fallback");
        return "World";
    }
}
