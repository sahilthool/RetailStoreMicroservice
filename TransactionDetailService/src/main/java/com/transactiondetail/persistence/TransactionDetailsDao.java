package com.transactiondetail.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.transactiondetail.bean.Transaction_Details;
import com.transactiondetail.bean.Transaction_Detailslist;


@Repository
public interface TransactionDetailsDao extends JpaRepository<Transaction_Details, Integer>{
	@Modifying
	@Transactional
	@Query(value = "Select transaction_id,item_id,quantity from transaction_details where transaction_id=:id",nativeQuery = true)
	Transaction_Detailslist searchwithId(@Param("id") int id);

	@Modifying
	@Transactional
	@Query(value = "Update transaction_details set quantity=:quantity where item_id=i:d",nativeQuery = true)
	boolean updateitemquantity(@Param("id")int item_id, @Param("quantity")int quantity);
}

/*
 * @Modifying
 * 
 * @Transactional
 * 
 * @Query(value = "UPDATE Employee SET salary=:sal where employeeId=:id") int
 * updateEmployeeSalary(@Param("id") int id,@Param("sal") double salary);
 */
