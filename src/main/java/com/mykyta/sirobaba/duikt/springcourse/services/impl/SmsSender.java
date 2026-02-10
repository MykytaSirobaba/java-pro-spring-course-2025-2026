package com.mykyta.sirobaba.duikt.springcourse.services.impl;

import com.mykyta.sirobaba.duikt.springcourse.services.MessageSender;
import org.springframework.stereotype.Component;

/**
 * Created by Mykyta Sirobaba on 10.02.2026.
 */
@Component
public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("{Sms} Sending message: " + message);
    }
}
