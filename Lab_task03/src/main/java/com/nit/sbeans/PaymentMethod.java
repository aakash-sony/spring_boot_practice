package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public interface PaymentMethod
{
	void processPayment(double amount);
}