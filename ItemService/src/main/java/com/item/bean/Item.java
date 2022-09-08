package com.item.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "allItems")
public class Item {
	
	@Id
	private int item_ID;
	private String item_Name;
	private String item_Category;
	@Column(name = "quantity")
	private int item_Quantity;
	@Column(name = "price")
	private double item_Price;	

}