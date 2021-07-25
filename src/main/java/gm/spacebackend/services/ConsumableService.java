package gm.spacebackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import gm.spacebackend.model.SmallConsumable;
import gm.spacebackend.repos.SmallConsumablesRepository;


public interface ConsumableService {
	public Optional<SmallConsumable> getConsumable(Long name);
	
	public long count();
}

