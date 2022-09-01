package com.customer.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerID;
	private String customerName;
	private String userName;
	private String password;
	
	public Customer(String customerName, String userName, String password) {
		super();
		this.customerName = customerName;
		this.userName = userName;
		this.password = password;
	}
	
	
	
	

}
