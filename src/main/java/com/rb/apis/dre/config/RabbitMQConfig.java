package com.rb.apis.dre.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue testeQueue(){
        return new Queue("teste", true);
    }
    @Bean
    DirectExchange exchange(){
        return new DirectExchange("exchange_test");
    }
    @Bean
    Binding testeBinding(Queue testeQueue, DirectExchange exchange){
        return BindingBuilder.bind(testeQueue).to(exchange).with("routing-key-test");
    }
    @Bean
    Binding bindingTeste(Queue queue, DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("routing-key-test");
    }
    @Bean
    public Jackson2JsonMessageConverter messageConverter(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return new Jackson2JsonMessageConverter(objectMapper);
    }
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory,
                                         Jackson2JsonMessageConverter messageConverter){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter);
        return  rabbitTemplate;
    }
}
