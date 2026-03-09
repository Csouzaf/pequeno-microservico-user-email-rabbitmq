package org.email.emailrabiqt.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener()
    public void listenerEmailQueue(@Payload String payload) {
        System.out.println(payload);
    }
}
