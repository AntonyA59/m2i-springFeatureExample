package m2i.game.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import m2i.game.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

}
