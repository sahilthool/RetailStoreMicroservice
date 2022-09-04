package com.customer.service;

import java.util.List;

import com.customer.bean.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	Customer getCustomer(String userName, String password);
	Customer saveCustomer(Customer customer);
	Customer getCustomerId(String userName);
	

}
