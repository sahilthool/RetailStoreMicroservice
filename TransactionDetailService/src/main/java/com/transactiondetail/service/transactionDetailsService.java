package com.transactiondetail.service;

import java.util.List;
import java.util.Optional;

import com.transactiondetail.bean.Transaction_Details;
import com.transactiondetail.bean.Transaction_Detailslist;



public interface transactionDetailsService {
	
	List<Transaction_Details> showalltransactionDetails();
	Transaction_Details addtransactionDetail(Transaction_Details trans_details);
	void deletetransactionDetail(int id);
    Transaction_Detailslist searchTransactionDetails(int transid);
//	boolean deleteitemfromcart(int item_id);
	boolean updateitemquantity(int item_id, int quantity);
	//boolean addToCart(Cart cart);
}
