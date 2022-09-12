package com.item.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.item.bean.Item;
import com.item.service.ItemService;


@SpringBootTest
class ItemServiceApplicationTests {
	
	private List<Item> item=new ArrayList<Item>();
	
	private ItemService itemService;

	@BeforeEach
	void setUp() throws Exception {
		item.add(new Item(1,"Book A","Book",20,350));
		item.add(new Item(2,"Book B","Book",30,500));
		item.add(new Item(3,"Book C","Book",25,550));
	}

	@AfterEach
	void tearDown() throws Exception {
		item = null;
	}
	
	

}


