package gm.spacebackend.model;

import gm.spacebackend.dto.StatsDto;

public class ConsumablesMapper implements IConsumablesMapper {

	@Override
	public CharacterConsumables map(StatsDto dto) {
		if (dto == null)
			return null;
		
		CharacterConsumables entity = new CharacterConsumables();
		entity.setName(dto.name);
		entity.setMight(new Consumable(dto.might.maxValue, dto.might.currentValue));
		entity.setSpeed(new Consumable(dto.speed.maxValue, dto.speed.currentValue));
		entity.setIntellect(new Consumable(dto.intellect.maxValue, dto.intellect.currentValue));
		entity.setStress(new Consumable(dto.stress.maxValue, dto.stress.currentValue));
		entity.setMental(new Consumable(dto.mental.maxValue, dto.mental.currentValue));
		entity.setTimesRested(dto.timesRested);
		return entity;
	}

}
