package gm.spacebackend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gm.spacebackend.model.CharacterConsumables;
import gm.spacebackend.services.ConsumableService;

@RestController
public class AppController {
	
	@Autowired
	ConsumableService consumableService;
    
    @GetMapping("/c/{id}")
    @ResponseBody
    public ResponseEntity<CharacterConsumables> getConsumable(@PathVariable String id) {
    	Optional<CharacterConsumables> consumable = consumableService.getConsumable(id);
    	if (consumable.isEmpty()) 
    		return ResponseEntity.notFound().build();
    	return ResponseEntity.ok(consumable.get());
    }
    
    @GetMapping("/c")
    @ResponseBody
    public ResponseEntity<List<CharacterConsumables>> getConsumable() {
    	List<CharacterConsumables> consumables = consumableService.getAll();
    	return ResponseEntity.ok(consumables);
    }
    
    @GetMapping("/count")
    @ResponseBody
    public ResponseEntity<Long> count() {
    	Long count = consumableService.count();
    	return ResponseEntity.ok(count);
    }
}
