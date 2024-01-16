package com.rb.apis.dre;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableRabbit
public class DreApplication {
	public static void main(String[] args) {
		SpringApplication.run(DreApplication.class, args);
	}

}
