package com.mykyta.sirobaba.duikt.springcourse.services.impl;

import com.mykyta.sirobaba.duikt.springcourse.services.MessageSender;

/**
 * Created by Mykyta Sirobaba on 10.02.2026.
 */
public class ViberSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via viber: " + message);
    }
}
