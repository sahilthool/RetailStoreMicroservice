package com.transaction.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.transaction.bean.Transaction;
import com.transaction.service.TransactionService;

@RestController
public class TransactionResource {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping(path = "/transactions",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Transaction> getAllEmployeesResource(){
		return transactionService.getAllTransactions();
	}
	
	@GetMapping(path = "/transactions/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Transaction getTransactionByIdResource(@PathVariable("id") int id) {
		Optional<Transaction> opTransaction= transactionService.searchTransactionById(id);
		Transaction transaction = opTransaction.orElse(new Transaction());
		return transaction;
	}
	
	@PostMapping(path = "/transactions",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Transaction saveTransactionResource(@RequestBody Transaction transaction) {
		return transactionService.saveTransaction(transaction);
	}
	
	@DeleteMapping(path = "/transactions/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Transaction deleteTransactionResource(@PathVariable("id") int id) {
		return transactionService.deleteTransaction(id);
	}
	
	@GetMapping(path = "/transactions/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Transaction getCustomerIdResource(@PathVariable("cid") int cid){
		return transactionService.getTransactionId(cid);
	}
	

}
