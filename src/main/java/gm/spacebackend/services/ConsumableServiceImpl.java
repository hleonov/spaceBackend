package gm.spacebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gm.spacebackend.dto.StatsDto;
import gm.spacebackend.model.CharacterConsumables;
import gm.spacebackend.model.ConsumablesMapper;
import gm.spacebackend.model.IConsumablesMapper;
import gm.spacebackend.repos.CharConsumablesRepository;

@Service
public class ConsumableServiceImpl implements ConsumableService {
	@Autowired
	CharConsumablesRepository<?> repository;
	
	@Override
	public Optional<CharacterConsumables> getConsumable(String id) {
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
	@Override
	public void save(StatsDto inputDto) {
		Optional<CharacterConsumables> charCons = repository.findById(inputDto.name);
		IConsumablesMapper mapper = new ConsumablesMapper();
		CharacterConsumables entity = mapper.map(inputDto);
		if (charCons.isEmpty() || entity == null)
			return;
		repository.save(entity);
	}
	
	@Override
	public void save(CharacterConsumables charConsumables) {
		repository.save(charConsumables);
	}

	@Override
	public void deleteById(String id) {
		try {
			repository.deleteById(id);
		} catch(IllegalArgumentException e) {
			System.out.println("No such character to delete: "+id);
		}
	}
}
