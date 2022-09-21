package m2i.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import m2i.game.model.Hero;
import m2i.game.service.HeroServices;


@RestController
public class HeroController {

	@Autowired
	private HeroServices heroServices;
	
	@GetMapping("/api/heroes")
	public Iterable<Hero> getHeroes()
	{
		Iterable<Hero> heroes = heroServices.getHeroes();
		
		return heroes;
	}
}
