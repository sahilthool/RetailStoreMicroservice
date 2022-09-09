package com.retailstore.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
	private int item_ID;
	private String item_Name;
	private String item_Category;
	private int quantity;
	private double price;	

}