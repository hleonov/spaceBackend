package gm.spacebackend.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import gm.spacebackend.model.SmallConsumable;

public interface SmallConsumablesRepository<S> extends JpaRepository<SmallConsumable, Long> {
	
	SmallConsumable findById(long id);

}
