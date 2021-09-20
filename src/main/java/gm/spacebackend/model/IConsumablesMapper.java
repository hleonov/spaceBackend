package gm.spacebackend.model;

import gm.spacebackend.dto.StatsDto;

//@Mapper(uses = { MapperResolver.class })
public interface IConsumablesMapper {
	
	//StatsDto map(CharacterConsumables entity);
	CharacterConsumables map(StatsDto dto);
}
