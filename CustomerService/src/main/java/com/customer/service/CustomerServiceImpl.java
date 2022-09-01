package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.bean.Customer;
import com.customer.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Customer getCustomer(String userName, String password) {
		return customerDao.findByUserNameAndPassword(userName,password);
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerDao.save(customer);
	}

}
