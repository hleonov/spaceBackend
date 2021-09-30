package gm.spacebackend.repos;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.spacebackend.model.CharacterConsumables;

public interface CharConsumablesRepository<S> extends JpaRepository<CharacterConsumables, String> {
	
	Optional<CharacterConsumables> findById(String id);
	
	List<CharacterConsumables> findAll();
	
}
