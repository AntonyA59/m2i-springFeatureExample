package m2i.game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Hero {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	private Integer gold; // or de départ
	
	private String heroName; // nom de la classe du héro
	
	protected Hero() {
	
	}
	
	public Hero(String heroName, Integer gold) {
		this.heroName = heroName;
		this.gold = gold;
	}

	public Integer getId() {
		return id;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}
	
	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
}
