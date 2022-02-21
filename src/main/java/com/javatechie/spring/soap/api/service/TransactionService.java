package com.javatechie.spring.soap.api.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.javatechie.spring.soap.api.loaneligibility.Acknowledgement;
import com.javatechie.spring.soap.api.loaneligibility.CustomerRequest;

@Service
public class TransactionService
{

	public Acknowledgement checkLoanEligibility(CustomerRequest request) {
		Acknowledgement acknowledgement = new Acknowledgement();
		Random random = new Random();
		int v = random.nextInt(100);
		if (v < 95) {
			acknowledgement.setTransactionStatus(true);
		} else {
			acknowledgement.setTransactionStatus(false);
		}
		System.out.println("V:" + v);
		return acknowledgement;

	}

}
