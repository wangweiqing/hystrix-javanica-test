package com.wwq.rxjava.service.impl;

import com.wwq.rxjava.service.BService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author wangweiqing
 * @version 1.0
 * @Description:
 * @Date 17/3/16
 */
@Service("bService")
public class BServiceImpl implements BService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BServiceImpl.class);
    public String longRunningMethod(){
        try {
            LOGGER.info("test start");
            Thread.sleep(3000L);
        } catch (Exception e){
            LOGGER.error("thread sleep overtime e", e);
        }
        LOGGER.info("long Running method running out");
        return "success";
    }

    
}
