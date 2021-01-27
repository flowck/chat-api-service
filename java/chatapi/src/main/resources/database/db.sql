CREATE DATABASE chatapiservice;

CREATE TABLE messages (
	id SERIAL NOT NULL,
	conversationId SERIAL,
	message text,
	userId SERIAL,
	created date,
	PRIMARY KEY (id),
	FOREIGN KEY (conversationId) REFERENCES conversations(id)
	FOREIGN KEY (userId) REFERENCES users(id)
);

CREATE TABLE conversations (
	id SERIAL NOT NULL,
	created date,
	PRIMARY KEY (id)
)

CREATE TABLE users (
	id SERIAL NOT NULL,
	username varchar(100) NOT NULL,
	password varchar(100) NOT NULL,
	created date,
	PRIMARY KEY (id)
)