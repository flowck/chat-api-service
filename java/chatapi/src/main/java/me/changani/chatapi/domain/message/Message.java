package me.changani.chatapi.domain.message;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.changani.chatapi.domain.message.dto.SendMessageDTO;

@Data
@Entity
@NoArgsConstructor
@Table(name = "messages")
public class Message {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "userid")
	private Long userId;

	@Column(name = "conversationid")
	private Long conversationId;

	@Column
	private String message;

	@Column(name = "created", columnDefinition = "DATE DEFAULT CURRENT_DATE")
	private Date created;

	public Message(SendMessageDTO message) {
		this.setUserId(message.getUserId());
		this.setMessage(message.getMessage());
		this.setConversationId(message.getConversationId());
		this.setCreated(new Date(System.currentTimeMillis()));
	}
}
