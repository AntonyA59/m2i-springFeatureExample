package m2i.game.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Player {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	private Integer gold;
	
	@ManyToMany
	@JoinTable(name = "player_items",
			  joinColumns = @JoinColumn(name = "player_id"), 
			  inverseJoinColumns = @JoinColumn(name = "item_id"))
	private List<Item> items;

	protected Player() {
	
	}
	
	public Player(Integer id, Integer gold) {
		this.id = id;
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
}
