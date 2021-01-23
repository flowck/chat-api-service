package me.changani.chatapi.domain.message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.changani.chatapi.domain.UniqueId;

@Repository
public interface MessageRepository extends JpaRepository<Message, UniqueId> {}
