package com.retailstore.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.retailstore.bean.Customer;

@FeignClient("customer-service")
public interface CustomerService {
	
	@GetMapping(path = "/customers/{username}/{password}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomer(@PathVariable("username") String userName, @PathVariable("password") String password);
	
	@PostMapping(path = "/customers",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer saveCustomer(@RequestBody Customer customer) ;

}
