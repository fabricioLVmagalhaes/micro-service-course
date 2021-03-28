package com.fabricio.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.fabricio.hrpayroll.entities.Payment;

@Service
public class PaymentServices {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
