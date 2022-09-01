package com.customer.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.bean.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerResource {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path = "/customers",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllEmployeesResource(){
		return customerService.getAllCustomers();
	}
	
	@PostMapping(path = "/customers",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer saveCustomerResource(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping(path = "/customers/{username}/{password}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomerByUsernameAndPasswordResource(@PathVariable("username") String userName, @PathVariable("password") String password) {
		Customer customer = customerService.getCustomer(userName, password);		
		return customer;
	}

}
