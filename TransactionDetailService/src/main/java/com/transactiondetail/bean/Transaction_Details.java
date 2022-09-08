package com.transactiondetail.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Transaction_Details {
	@Id
	int transaction_ID;
	int item_ID;
	int quantity;

}
