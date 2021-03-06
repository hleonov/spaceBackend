package gm.spacebackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import gm.spacebackend.dto.RollInfoDto;
import gm.spacebackend.dto.StatsDto;
import gm.spacebackend.model.CharacterConsumables;
import gm.spacebackend.services.ConsumableService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ConsumablesController {
	@Autowired
	ConsumableService consumableService;

    @SubscribeMapping("/c/get")
    public List<CharacterConsumables> findAll() {
        return consumableService.getAll();
    }
    
    @MessageMapping("/stats")
    @SendTo("/topic/consume_stats")
    public StatsDto statsChanged(StatsDto dto) {
    	System.out.println("hit statsChanged backend");
    	consumableService.save(dto);
    	return dto;
    }
    
}