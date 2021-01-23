package me.changani.chatapi.domain.message.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SendMessageDTO {
	@NotBlank(message = "The field message should not be empty")
	@NotNull(message = "The field message should not be null")
	private String message;
	
	@NotBlank(message = "The field sender should not be empty")
	@NotNull(message = "The field sender should not be null")
	private String sender;
	
	@NotNull(message = "The field conversationId should not be null")
	private Long conversationId;
}
