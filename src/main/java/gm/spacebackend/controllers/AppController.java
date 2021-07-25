package gm.spacebackend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gm.spacebackend.model.SmallConsumable;
import gm.spacebackend.repos.SmallConsumablesRepository;
import gm.spacebackend.services.ConsumableService;

@RestController
public class AppController {
	
	@Autowired
	ConsumableService consumableService;
	
    @RequestMapping("/hello")
    @ResponseBody
    String home() {
      return "Hello World!<br>Size of repo: "+consumableService.count();
    }
    
    @GetMapping("/c/{id}")
    @ResponseBody
    public ResponseEntity<SmallConsumable> getConsumable(@PathVariable Long id) {
    	Optional<SmallConsumable> consumable = consumableService.getConsumable(id);
    	if (consumable.isEmpty()) 
    		return ResponseEntity.notFound().build();
    	return ResponseEntity.ok(consumable.get());
    }
}
