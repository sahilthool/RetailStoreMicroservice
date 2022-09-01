package com.retailstore.bean;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
	
	private int customerID;
	private String customerName;
	private String userName;
	private String password;
	

}
