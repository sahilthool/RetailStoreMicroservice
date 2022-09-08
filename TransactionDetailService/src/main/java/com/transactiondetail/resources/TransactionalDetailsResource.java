package com.transactiondetail.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.transactiondetail.bean.Transaction_Details;
import com.transactiondetail.bean.Transaction_Detailslist;
import com.transactiondetail.service.transactionDetailsService;


@RestController
public class TransactionalDetailsResource {
@Autowired
private transactionDetailsService tds;
@GetMapping(path = "/transactional_details",produces = MediaType.APPLICATION_JSON_VALUE)
public Transaction_Detailslist getAllTransactionDetailsResource(){
	return new Transaction_Detailslist(tds.showalltransactionDetails());
}

@PostMapping(path = "/transactional_details",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
public Transaction_Details saveCustomerResource(@RequestBody  Transaction_Details transaction_details) {
	return tds.addtransactionDetail(transaction_details);
}

@GetMapping(path = "/transactional_details/{transid}",produces = MediaType.APPLICATION_JSON_VALUE)
public Transaction_Detailslist getAllTransactionDetailsByIdResource(@PathVariable("transid") int id) {
	Transaction_Detailslist td=tds.searchTransactionDetails(id);
	return td;
}

@DeleteMapping(path = "/transactional_details",produces = MediaType.APPLICATION_JSON_VALUE)
public void deleteTransactionDetailResource(@PathVariable("id") int id) {
	 tds.deletetransactionDetail(id);
}

@PostMapping(path = "/transactional_details/{id}/{quan}",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
public boolean UpdateTransactionDetailResource(@PathVariable("id") int id,@PathVariable("quan") int quantity) {
	return tds.updateitemquantity(id, quantity);
}
}
