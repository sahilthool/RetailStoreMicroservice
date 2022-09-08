package com.item.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.item.bean.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {
	
}
