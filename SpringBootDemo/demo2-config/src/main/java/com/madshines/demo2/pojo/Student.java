package com.madshines.demo2.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author :madshines
 * @Date: 2020-05-06
 * @Description: com.madshines.demo2.pojo
 * @version: 1.0
 */
/*
将配置文件中的配置每一个属性的值，映射到这个组件中
@ConfigurationProperties:告诉SpringBoot将本类中所有的属性和配置文件中相关的配置进行绑定；
    prefix="student":配置文件中那个下面的所有属性进行一一映射
只有这个组件是容器中的组件，才会生效
*/
@Data
@Component
@ConfigurationProperties(prefix = "student")
public class Student{
    private int id;
    private String name;
    private int age;
    private Date date;

    private Map<Object,String> map;
    private List<String> list;

    private Dog dog;
}
