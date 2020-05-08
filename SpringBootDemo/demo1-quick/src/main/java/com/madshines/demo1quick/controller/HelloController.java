package com.madshines.demo1quick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author :madshines
 * @Date: 2020-05-06
 * @Description: com.madshines.demo1quick.controller
 * @version: 1.0
 */
/*@Controller
@ResponseBody*/
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "hello world quick";
    }
}
