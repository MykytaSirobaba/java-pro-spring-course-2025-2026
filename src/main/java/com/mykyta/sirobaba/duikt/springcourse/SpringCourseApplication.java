package com.mykyta.sirobaba.duikt.springcourse;

import com.mykyta.sirobaba.duikt.springcourse.config.AppConfig;
import com.mykyta.sirobaba.duikt.springcourse.services.NotificationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCourseApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class
        );

        NotificationService notificationService = context.getBean(NotificationService.class);

        notificationService.sendAllNotifications("Hello Spring World!");

        context.close();
    }

}
