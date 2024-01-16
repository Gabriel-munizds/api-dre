package com.rb.apis.dre.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {
    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    public QueueSender(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    public void sendMessage(String order){
        rabbitTemplate.convertAndSend(queue.getName(), order);
    }
}
