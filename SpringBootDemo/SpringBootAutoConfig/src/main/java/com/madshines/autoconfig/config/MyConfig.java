package com.madshines.autoconfig.config;

import com.madshines.autoconfig.pojo.Dog;
import com.madshines.autoconfig.pojo.Student;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author :madshines
 * @Date: 2020-05-07
 * @Description: com.madshines.autoconfig.config
 * @version: 1.0
 */
@Configuration
public class MyConfig {
    @Bean
    public Student student(){
        return new Student();
    }

    @Bean
    @ConditionalOnWebApplication
    @ConditionalOnProperty({"dog.name"})
    @ConditionalOnJava(JavaVersion.EIGHT)
    @ConditionalOnBean(Student.class)
//    @ConditionalOnClass(Student.class)
    @ConditionalOnResource(resources = {"classpath:application.yaml"})
    public Dog dog(){
        return new Dog();
    }
}
