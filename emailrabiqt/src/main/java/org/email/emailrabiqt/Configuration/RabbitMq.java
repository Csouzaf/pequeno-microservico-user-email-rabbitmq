package org.email.emailrabiqt.Configuration;


import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SerializerMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMq {

    public static final String EXCHANGE = "x.error-handling-demo";
    public static final String QUEUE_INFINITE_LOOP = "q.error-handling-demo.infinite-loop";
    public static final String ROUTING_KEY_INFINITE_LOOP = "infinite-loop";


    public final String EMAIL_QUEUE_NAME = "email_queue";

    @Bean
    public Queue getEmailQueue() {
        return new Queue(EMAIL_QUEUE_NAME, true);
    }

    @Bean
    public Exchange exchange() {
        return new DirectExchange("exemplo");
    }

    @Bean
    public Declarables infiniteLoopConfiguration() {
        Queue queueInfiniteLoopDemo = new Queue(QUEUE_INFINITE_LOOP, false);
        DirectExchange exchange = new DirectExchange(EXCHANGE);
        return new Declarables(exchange, queueInfiniteLoopDemo,
                BindingBuilder.bind(queueInfiniteLoopDemo).to(exchange).with(ROUTING_KEY_INFINITE_LOOP)
                );
    }

    @Bean
    public MessageConverter messageConverter() {
        return new JacksonJsonMessageConverter();
    }



}
