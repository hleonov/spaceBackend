package gm.spacebackend.repos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gm.spacebackend.model.CharacterConsumables;
import gm.spacebackend.model.Consumable;

@Component
public class DataLoader implements CommandLineRunner {

    private CharConsumablesRepository<?> chrRepo;
    
    public DataLoader(CharConsumablesRepository<?> repo) {
        this.chrRepo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
         LoadUsers();
    }

    private void LoadUsers() {
    	chrRepo.save(new CharacterConsumables("William", new Consumable(13), new Consumable(17), new Consumable(18), 
    			new Consumable(10,1), new Consumable(8,0)));
    	chrRepo.save(new CharacterConsumables("Tobi", new Consumable(18), new Consumable(16), new Consumable(9), 
    			new Consumable(19,5), new Consumable(6,2)));
    	chrRepo.save(new CharacterConsumables("Barbara", new Consumable(8), new Consumable(14), new Consumable(18), 
    			new Consumable(10,2), new Consumable(16,1)));
    	chrRepo.save(new CharacterConsumables("Yergon", new Consumable(12), new Consumable(16), new Consumable(18), 
    			new Consumable(10,3), new Consumable(8,1)));
    	
    }
}