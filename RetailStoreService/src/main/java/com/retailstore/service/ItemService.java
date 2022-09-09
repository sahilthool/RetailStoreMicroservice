package com.retailstore.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.retailstore.bean.Item;

@FeignClient("item-service")
public interface ItemService {
	@GetMapping(path = "/items",produces = MediaType.APPLICATION_JSON_VALUE)
	public Item getAllItems();
	
	@GetMapping(path = "/items/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Item findByItemId(@PathVariable("cid") int cid);
	
	@PostMapping(path = "/items",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Item saveItem(@RequestBody Item item) ;
}
