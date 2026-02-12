//package com.mykyta.sirobaba.duikt.springcourse.services.impl;
//
//import com.mykyta.sirobaba.duikt.springcourse.services.MessageSender;
//import com.mykyta.sirobaba.duikt.springcourse.services.NotificationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
///**
// * Created by Mykyta Sirobaba on 10.02.2026.
// */
//@Service
//public class NotificationServiceImpl implements NotificationService {
//
//    private final MessageSender emailSender;
//    private final MessageSender viberSender;
//    private final MessageSender smsSender;
//
//    @Autowired
//    public NotificationServiceImpl(@Qualifier("emailSender") MessageSender emailSender,
//                                   @Qualifier("viberSender") MessageSender viberSender,
//                                   @Qualifier("smsSender") MessageSender smsSender) {
//        this.emailSender = emailSender;
//        this.viberSender = viberSender;
//        this.smsSender = smsSender;
//    }
//
//    @Override
//    public void sendAllNotifications(String message) {
//        System.out.println("Sending all notifications to viber");
//        emailSender.sendMessage(message);
//        smsSender.sendMessage(message);
//        viberSender.sendMessage(message);
//        System.out.println("All notifications sent successfully");
//    }
//}
