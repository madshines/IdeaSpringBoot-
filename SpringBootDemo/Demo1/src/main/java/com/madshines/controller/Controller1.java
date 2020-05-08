package com.madshines.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author :madshines
 * @Date: 2020-05-06
 * @Description: com.madshines.controller
 * @version: 1.0
 */
@Controller
public class Controller1 {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
