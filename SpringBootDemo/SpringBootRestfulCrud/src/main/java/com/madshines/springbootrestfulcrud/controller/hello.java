package com.madshines.springbootrestfulcrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author :madshines
 * @Date: 2020-05-08
 * @Description: com.madshines.springbootrestfulcrud.controller
 * @version: 1.0
 */
@RestController
public class hello {
    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
