//package com.retailstore.resources;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.retailstore.bean.Customer;
//import com.retailstore.service.CustomerService;
//
//@RestController
//public class RetailStoreResource {
//	
//	@Autowired
//	private CustomerService customerService;
//	
//	@GetMapping(path = "/details/{cId}",produces = MediaType.APPLICATION_JSON_VALUE)
//	public Customer getCustomer(@PathVariable("username") String userName, @PathVariable("password") String password) {
//		
//		Customer customer = customerService.getCustomer(userName, password);
//		
//		return customer;
//			
//						
//		}
//
//}
