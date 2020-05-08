package com.madshines.demo2;

import com.madshines.demo2.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ConfigApplicationTests {
    @Autowired
    Student student;
    @Test
    void contextLoads() {
        System.out.println(student);
    }

}
