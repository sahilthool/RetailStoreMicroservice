package com.transaction.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.bean.Transaction;

@Repository
public interface TransactionDao extends JpaRepository<Transaction, Integer>{
	
	Transaction findByCustomerID(int customerID);

}
