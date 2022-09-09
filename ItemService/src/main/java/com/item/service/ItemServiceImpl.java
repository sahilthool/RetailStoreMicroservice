package com.item.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.bean.Item;
import com.item.persistence.ItemDao;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<Item> getAllItems() {
		return itemDao.findAll();
	}
	
	@Override
	public Optional<Item> findByItemId(int item_Id) {
		return itemDao.findById(item_Id);
	}

	@Override
	public Item saveTransaction(Item item) {
		itemDao.save(item);
		return item;
	}
	
	

}