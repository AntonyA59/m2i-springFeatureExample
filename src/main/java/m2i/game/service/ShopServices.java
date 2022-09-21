package m2i.game.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import m2i.game.dao.ItemRepository;
import m2i.game.dao.PlayerRepository;
import m2i.game.exception.ForbiddenException;
import m2i.game.model.Item;
import m2i.game.model.Player;

@Service
public class ShopServices {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private PlayerRepository playerReposity;
	
	public void Buy(int playerId, int itemId) throws EntityNotFoundException, ForbiddenException
	{
		Optional<Item> optItem = itemRepository.findById(itemId);
		Optional<Player> optPlayer = playerReposity.findById(playerId);
		
		if (optItem.isEmpty() || optPlayer.isEmpty())
			throw new EntityNotFoundException();
		
		Item item = optItem.get();
		Player player = optPlayer.get();
		
		if (player.getGold() < item.getPrice())
			throw new ForbiddenException();
		
		player.setGold(player.getGold() - item.getPrice());
		playerReposity.save(player);
	}
}
