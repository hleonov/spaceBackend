package gm.spacebackend.services;

import java.util.List;
import java.util.Optional;

import gm.spacebackend.dto.StatsDto;
import gm.spacebackend.model.CharacterConsumables;


public interface ConsumableService {
	public Optional<CharacterConsumables> getConsumable(String name);
	
	public long count();
	
	public List<CharacterConsumables> getAll();
	
	public void save(StatsDto inputDto);
	
	public void save(CharacterConsumables charConsumables);

	void deleteById(String id);
 }

