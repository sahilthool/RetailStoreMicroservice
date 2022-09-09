package com.item.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.item.bean.Item;
import com.item.service.ItemService;

@RestController
public class ItemResource {

	@Autowired
	private ItemService itemService;
	
	@GetMapping(path = "/items",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Item> getAllItemsResource(){
		return itemService.getAllItems();
	}
	
	@GetMapping(path = "/items/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Item findByItemIdResource(@PathVariable("id") int id) {
		Optional<Item> opItem= itemService.findByItemId(id);
		Item item = opItem.orElse(new Item());
		return item;
	}
	
	@PostMapping(path = "/items",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Item saveItemResource(@RequestBody Item item) {
		return itemService.saveTransaction(item);
	}
	
}