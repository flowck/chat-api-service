package me.changani.chatapi.domain.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.changani.chatapi.domain.message.dto.SendMessageDTO;

@Service
public class MessageUseCase {
	@Autowired
	MessageRepository messageRepository;
	
	public Message sendMessage(SendMessageDTO message) {
		return messageRepository.save(new Message(message));
	}
}
