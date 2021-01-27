package me.changani.chatapi.domain.conversation;

import me.changani.chatapi.domain.conversation.dto.ConversationDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversationUseCases {
	@Autowired
	ConversationRepository conversationRepository;
	
	public List<ConversationDTO> getConversations() {
		List<Conversation> conversations = conversationRepository.findAll();
		List<ConversationDTO> listOfConversations = new ArrayList<ConversationDTO>();
		
		conversations.stream().forEach(conversation -> {
			listOfConversations.add(new ConversationDTO(conversation));
		});
		
		return listOfConversations;
	} 
	
	public ConversationDTO getSingleConversation(Long id) {
		return new ConversationDTO(conversationRepository.findById(id).get());
	}
}
