package me.changani.chatapi.domain.message;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import me.changani.chatapi.domain.UniqueId;
import me.changani.chatapi.domain.Username;
import me.changani.chatapi.domain.message.dto.SendMessageDTO;

@Data
@Entity
@Table(name = "messages")
public class Message {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String sender;
	
	@Column
	private Long conversationId;
	
	@Column
	private String message;
	
	@Column
	private Date created;
	
	public Message(SendMessageDTO message) {
		this.setSender(message.getSender());
		this.setConversationId(message.getConversationId());
		this.setMessage(message.getMessage());
	}
}
