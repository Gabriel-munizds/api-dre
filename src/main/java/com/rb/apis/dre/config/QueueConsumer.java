package com.rb.apis.dre.config;

import com.rb.apis.dre.dtos.TipoClienteDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {
    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload TipoClienteDto fileBody){
        System.out.println("Message: " + fileBody.getDescricao() + " " + fileBody.getId());
    }
}
