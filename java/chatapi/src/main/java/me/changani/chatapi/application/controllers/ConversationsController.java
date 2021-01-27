package me.changani.chatapi.application.controllers;

import java.util.List;

import me.changani.chatapi.domain.conversation.ConversationUseCases;
import me.changani.chatapi.domain.conversation.dto.ConversationDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/conversations")
public class ConversationsController {
	@Autowired
	ConversationUseCases conversationUseCases;
	
	/*
	 * Get all conversations
	 */
	@GetMapping
	public List<ConversationDTO> getAllConversations() {
		return conversationUseCases.getConversations();
	}
	
	
	/*
	 * Get a single conversation
	 */
	@GetMapping("{id}")
	public ConversationDTO getSingleConversation(@PathVariable("id") Long id){
		return conversationUseCases.getSingleConversation(id);
	}
	
}