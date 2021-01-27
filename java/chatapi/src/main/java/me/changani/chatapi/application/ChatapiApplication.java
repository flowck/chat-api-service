package me.changani.chatapi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"me.changani.chatapi.domain"})
@EnableJpaRepositories("me.changani.chatapi.domain")
@ComponentScan({"me.changani.chatapi.application.controllers", "me.changani.chatapi.domain"})
public class ChatapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatapiApplication.class, args);
	}

}
