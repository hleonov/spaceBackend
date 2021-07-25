package gm.spacebackend.services;

import java.util.List;
import java.util.Optional;

import gm.spacebackend.model.CharacterConsumables;


public interface ConsumableService {
	public Optional<CharacterConsumables> getConsumable(Long name);
	
	public long count();
	
	public List<CharacterConsumables> getAll();
 }

