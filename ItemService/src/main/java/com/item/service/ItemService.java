package com.item.service;

import java.util.List;
import java.util.Optional;

import com.item.bean.Item;

public interface ItemService {
	List<Item> getAllItems();	
	Optional<Item> findByItemId(int item_Id);
	Item saveTransaction(Item item);
}
