package com.customer.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.bean.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	
	
	Customer findByUserNameAndPassword(String userName, String password);
	Customer findByUserName(String userName);

}
