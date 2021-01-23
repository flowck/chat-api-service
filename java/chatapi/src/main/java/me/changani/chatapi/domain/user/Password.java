package me.changani.chatapi.domain.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class Password {
	@NotBlank
	@NotNull
	private String value;
}
