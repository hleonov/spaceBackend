package gm.spacebackend.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatLogController {

	@MessageMapping("/chatlog")
	@SendTo("/topic/consume_chatlog")
	public String chat(String message) {
		System.out.println("chatlog hit backend"+message);
		return message;
	}
}
