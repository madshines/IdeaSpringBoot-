package com.madshines.springbootconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author :madshines
 * @Date: 2020-05-07
 * @Description: com.madshines.springbootconfig.controller
 * @version: 1.0
 */
@RestController
public class Demo1 {

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
