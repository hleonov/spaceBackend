package gm.spacebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import gm.spacebackend.model.SmallConsumable;
import gm.spacebackend.repos.SmallConsumablesRepository;

@Component
public class ConsumableServiceImpl implements ConsumableService {
	@Autowired
	SmallConsumablesRepository<?> repository;
	
	@Override
	public Optional<SmallConsumable> getConsumable(Long id) {
		return repository.findById(id);
	}
	@Override
	public long count() {
		return repository.count();
	}
	@Override
	public List<SmallConsumable> getAll() {
		return repository.findAll();
	}

}
