package com.madshines.autoconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootautoconfigApplicationTests {
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    void contextLoads() {
        System.out.println(applicationContext.containsBean("student"));
        boolean dog = applicationContext.containsBean("dog");
        System.out.println("dog:"+dog);
    }

}
