package com.stu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    static  Logger log = LoggerFactory.getLogger(HelloController.class);
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        log.debug("debug~~~~~~~~~~~~~~~~~~~~~~");
        log.warn("warn~~~~~~~~~~~~~~~~~~~~~~");
        log.error("error~~~~~~~~~~~~~~~~~~~~~~");
        return "Hello World!";
    }
}
