package com.item.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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
}