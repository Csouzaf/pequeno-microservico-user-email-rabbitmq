package org.email.emailrabiqt.Configuration;


import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMq {

    public static final String EMAIL_QUEUE_NAME = "email_queue";


    public Queue getEmailQueue() {
        return new Queue(EMAIL_QUEUE_NAME, false);
    }

    public Exchange exchange() {
        return new DirectExchange("exemplo");
    }
}
