package com.mykyta.sirobaba.duikt.springcourse.config;

import com.mykyta.sirobaba.duikt.springcourse.services.MessageSender;
import com.mykyta.sirobaba.duikt.springcourse.services.impl.ViberSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Mykyta Sirobaba on 10.02.2026.
 */
@Configuration
@ComponentScan("com.mykyta.sirobaba.duikt.springcourse")
public class AppConfig {

    @Bean("viberSenderBean")
    public MessageSender viberSender() {
        return new ViberSender();
    }
}
