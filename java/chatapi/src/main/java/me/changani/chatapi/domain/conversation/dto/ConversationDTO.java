package me.changani.chatapi.domain.conversation.dto;


import java.util.List;

import lombok.Getter;
import lombok.Setter;
import me.changani.chatapi.domain.conversation.Conversation;
import me.changani.chatapi.domain.message.Message;

@Getter
@Setter
public class ConversationDTO {
	private Long id;
	private List<Message> messages;
	
	public ConversationDTO(Conversation conversation) {
		this.setId(conversation.getId());
		this.setMessages(conversation.getMessages());
	}
}
