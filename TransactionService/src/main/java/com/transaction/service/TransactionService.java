package com.transaction.service;

import java.util.List;
import java.util.Optional;

import com.transaction.bean.Transaction;

public interface TransactionService {
	
	List<Transaction> getAllTransactions();
	Optional<Transaction> searchTransactionById(int transactionId);
	Transaction saveTransaction(Transaction transaction);
	Transaction deleteTransaction(int transactionId);
	Transaction getTransactionId(int customerID);
	

}
