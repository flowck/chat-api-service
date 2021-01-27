package me.changani.chatapi.application.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.changani.chatapi.domain.message.Message;
import me.changani.chatapi.domain.message.MessageUseCase;
import me.changani.chatapi.domain.message.dto.SendMessageDTO;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
	@Autowired
	MessageUseCase messageUseCase;
	
	@PostMapping
	public Message sendMessage(@Valid  @RequestBody SendMessageDTO message) {
		return messageUseCase.sendMessage(message);
	}
}
