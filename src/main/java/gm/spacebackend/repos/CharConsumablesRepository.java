package gm.spacebackend.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import gm.spacebackend.model.CharacterConsumables;

public interface CharConsumablesRepository<S> extends JpaRepository<CharacterConsumables, Long> {
	
	CharacterConsumables findById(long id);
}
