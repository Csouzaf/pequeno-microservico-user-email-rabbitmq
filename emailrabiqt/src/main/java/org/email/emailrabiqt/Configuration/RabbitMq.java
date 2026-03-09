package org.email.emailrabiqt.Configuration;

import com.rabbitmq.client.AMQP.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMq {

    public static final String EMAIL_QUEUE_NAME = "email_queue";


    public Queue getEmailQueue() {
        return new Queue();
    }
}
