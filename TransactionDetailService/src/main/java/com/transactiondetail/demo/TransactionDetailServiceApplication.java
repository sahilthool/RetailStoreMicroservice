package com.transactiondetail.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.transactiondetail")
@EntityScan(basePackages = "com.transactiondetail.bean")
@EnableJpaRepositories(basePackages = "com.transactiondetail.persistence")
public class TransactionDetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionDetailServiceApplication.class, args);
	}

}
