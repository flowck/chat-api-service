package me.changani.chatapi.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import me.changani.chatapi.domain.UniqueId;
import me.changani.chatapi.domain.Username;

@Data
@Entity
@Table(name = "users")
public class User {
	@Id
	@Column()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String username;
	
	@Column
	private String password;
}
