package com.transactiondetail.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transactiondetail.bean.Transaction_Details;
import com.transactiondetail.bean.Transaction_Detailslist;
import com.transactiondetail.persistence.TransactionDetailsDao;



@Service
public class transactionDetailsServiceImpl implements transactionDetailsService {

	private TransactionDetailsDao td1;
	@Autowired
	public void setTd(TransactionDetailsDao td1) {
		this.td1 = td1;
	}
	 
//	private TransactionDetailsDao td;
//	@Autowired
//	public void setTd(TransactionDetailsDao td) {
//		this.td = td;
//	}
//	  
//	private TransactionDao transactionDao;
//	
//	@Autowired
//	public void setTransactionDao(TransactionDao transactionDao) {
//		this.transactionDao = transactionDao;
//	}
//	
//	private AllitemDao aa;
//
//	@Autowired
//	public void setAllitemDao(AllitemDao aa) {
//		this.aa= aa;
//	}
//	
//
//	@Override
//	public boolean addToCart(Cart cart) {
//		
//		Transaction_Details transaction_Details=null;
//		
//		int custid = cart.getCustomer_id();
//		int item_id= cart.getItem_Id();
//		int quantity = cart.getQuantity();
//		
//		int transactionId = transactionDao.getTransactionId(custid);
//		
//		Item item = aa.searchItem(item_id);
//		
//		if(item.getItem_Quantity() >= quantity && quantity > 0) {
//			transaction_Details = new Transaction_Details(transactionId, item_id, quantity);
//			td.addtransactionDetail(transaction_Details);
//			aa.updateQuantity(item_id, quantity);
//			return true;
//		}
//		return false;
//		
////		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/retailstore", "root",
////				"wiley");
////				PreparedStatement preparedStatement = connection
////						.prepareStatement("SELECT * FROM transaction where customer_Id=?");) {
////
////			preparedStatement.setInt(1,custid);
////
////			ResultSet resultSet = preparedStatement.executeQuery();
////			
////			
////			Allitemdaoimpl itemdao=new Allitemdaoimpl();
////			Item item=itemdao.searchItem(item_id);
////			if(item.getItem_Quantity()>=quantity && quantity>0)
////			{
////
////			if (resultSet.next()) {
////				int transaction_id = resultSet.getInt("transaction_Id");
////				transaction=new Transaction_Details(transaction_id,item_id,quantity);
////				td.addtransactionDetail(transaction);
////			}
////			itemdao.updateQuantity(item_id, quantity);
////			       return true;
////			}
////		} catch (SQLException e) {
////			e.printStackTrace();
////		}
////			return false;
//	}

	@Override
	public List<Transaction_Details> showalltransactionDetails() {
		
		return td1.findAll();
		
	}

	@Override
	public Transaction_Details addtransactionDetail(Transaction_Details trans_details) {
		return td1.save(trans_details);
	}

	@Override
	public void deletetransactionDetail(int id) {
		td1.deleteById(null);
	}

	
	  @Override
	 public Transaction_Detailslist searchTransactionDetails(int transid) { 
		   return td1.searchwithId(transid); 
		   }
	 
//	@Override
//	public boolean deleteitemfromcart(int item_id) {
//	    return td.deleteitemfromcart(item_id);
//	}
//
	@Override
	public boolean updateitemquantity(int item_id, int quantity) {
		return td1.updateitemquantity(item_id, quantity);
	}

	
}
