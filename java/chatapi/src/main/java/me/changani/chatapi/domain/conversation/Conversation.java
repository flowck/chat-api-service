package me.changani.chatapi.domain.conversation;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import me.changani.chatapi.domain.UniqueId;
import me.changani.chatapi.domain.message.Message;

@Data
@Entity
@Table(name = "conversation")
public class Conversation {
	@Id
	@Column()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// @OneToMany(mappedBy = "conversationId")
	// private List<Message> messages; 
}
