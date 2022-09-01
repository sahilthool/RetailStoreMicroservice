package com.transaction.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.bean.Transaction;
import com.transaction.persistence.TransactionDao;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionDao transactionDao;

	@Override
	public List<Transaction> getAllTransactions() {
		return transactionDao.findAll();
	}

	@Override
	public Optional<Transaction> searchTransactionById(int transactionId) {
		return transactionDao.findById(transactionId);
	}

	@Override
	public Transaction saveTransaction(Transaction transaction) {
		return transactionDao.save(transaction);
	}

	@Override
	public Transaction deleteTransaction(int transactionId) {
		Optional<Transaction> tranOptional = transactionDao.findById(transactionId);
		if(tranOptional.isPresent()) {
			transactionDao.deleteById(transactionId);
			return tranOptional.get();
		}
		return new Transaction();
	}

	@Override
	public Transaction getTransactionId(int customerID) {
		return transactionDao.findByCustomerID(customerID);
	}

}
