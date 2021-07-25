package gm.spacebackend.repos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gm.spacebackend.model.SmallConsumable;

@Component
public class DataLoader implements CommandLineRunner {

    private SmallConsumablesRepository<?> scRepo;

    public DataLoader(SmallConsumablesRepository<?> repo) {
        this.scRepo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
         LoadUsers();
    }

    private void LoadUsers() {
        scRepo.save(new SmallConsumable("Tobi", 1));
        scRepo.save(new SmallConsumable("Simone", 2));
    }
}