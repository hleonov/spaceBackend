package gm.spacebackend.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import gm.spacebackend.dto.GmRollInfoDto;
import gm.spacebackend.dto.RollInfoDto;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class RollInfoController {
	@MessageMapping("/roll")
	@SendTo("/topic/consume_roll")
	public RollInfoDto rollInfoChanged(RollInfoDto dto) {
		System.out.println("hit PLAYER INFO backend "+dto.name);
		return dto;
	}

	@MessageMapping("/gminfo")
	@SendTo("/topic/consume_gminfo")
	public GmRollInfoDto gmRollInfoChanged(GmRollInfoDto dto) {
		System.out.println("hit GM INFO backend "+dto.name);
		return dto;
	}
}
