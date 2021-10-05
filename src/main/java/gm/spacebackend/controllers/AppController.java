package gm.spacebackend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gm.spacebackend.dto.StatsDto;
import gm.spacebackend.model.CharacterConsumables;
import gm.spacebackend.model.Consumable;
import gm.spacebackend.repos.CharConsumablesRepository;
import gm.spacebackend.services.ConsumableService;

@RestController
@CrossOrigin(origins = "*")
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
    
    @DeleteMapping("/c/delete/{id}")
    @ResponseBody
    public void deleteCharacter(@PathVariable String id) {
    	consumableService.deleteById(id);
    }
    
    @PostMapping("/c/create")
    @ResponseBody
    public void createNewCharacter(@RequestParam String name) {
    	System.out.println(" --> BACKEND: hit post mapping with name: "+name);
    	consumableService.save(new CharacterConsumables(name));
    }
    
    @GetMapping("/count")
    @ResponseBody
    public ResponseEntity<Long> count() {
    	Long count = consumableService.count();
    	return ResponseEntity.ok(count);
    }

}
