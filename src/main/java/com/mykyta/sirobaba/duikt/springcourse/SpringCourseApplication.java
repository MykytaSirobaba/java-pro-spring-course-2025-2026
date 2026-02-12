package com.mykyta.sirobaba.duikt.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCourseApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringCourseApplication.class, args);

        String[] beanNames = applicationContext.getBeanDefinitionNames();

        System.out.println("Total bean names: " + beanNames.length);

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
