package com.retailstore.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.retailstore.bean.Transaction;

@FeignClient("transaction-service")
public interface TransactionService {
	
	@PostMapping(path = "/transactions",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Transaction saveTransaction(@RequestBody Transaction transaction);
	
	@GetMapping(path = "/transactions/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Transaction getTransactionId(@PathVariable("cid") int cid);

}
