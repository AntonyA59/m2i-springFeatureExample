package m2i.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import m2i.game.dao.HeroRepository;
import m2i.game.model.Hero;
import m2i.game.web.dto.HeroDto;


@Service
public class HeroServices {

	@Autowired
	private HeroRepository heroRepository;
	
	public void createHero(HeroDto heroDto)
	{
		Hero hero = new Hero(heroDto.getHeroName(), heroDto.getGold());
		heroRepository.save(hero);
	}
	
	public Iterable<Hero> getHeroes()
	{
		return heroRepository.findAll();
	}
}
