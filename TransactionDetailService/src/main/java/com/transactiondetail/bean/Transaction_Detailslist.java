package com.transactiondetail.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Entity
public class Transaction_Detailslist {
	List<Transaction_Details> list;
}
