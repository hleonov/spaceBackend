package gm.spacebackend.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import gm.spacebackend.dto.ChatLogMessageDto;

@Controller
public class ChatLogController {

	@MessageMapping("/chatlog")
	@SendTo("/topic/consume_chatlog")
	public ChatLogMessageDto chat(ChatLogMessageDto dto) {
		System.out.println("chatlog hit backend: "+dto.source+" : "+dto.message);
		return dto;
	}
}
