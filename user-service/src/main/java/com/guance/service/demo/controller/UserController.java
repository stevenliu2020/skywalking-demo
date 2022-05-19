package com.guance.service.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyj
 * @since 2022/5/19 10:23
 */
@RestController
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/ping")
    public String getPing(){
        logger.info("pong");
        return "pong ";
    }

    @GetMapping("/user")
    public String getUserInfo(){
        logger.info("请求 UserInfo 接口");
        return "success";
    }
}
