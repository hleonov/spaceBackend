package gm.spacebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gm.spacebackend.model.CharacterConsumables;
import gm.spacebackend.repos.CharConsumablesRepository;

@Service
public class ConsumableServiceImpl implements ConsumableService {
	@Autowired
	CharConsumablesRepository<?> repository;
	
	@Override
	public Optional<CharacterConsumables> getConsumable(Long id) {
		return repository.findById(id);
	}
	@Override
	public long count() {
		return repository.count();
	}
	@Override
	public List<CharacterConsumables> getAll() {
		return repository.findAll();
	}

}
