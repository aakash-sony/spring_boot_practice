package com.nit.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.PaymentMethod;

@Component("service")
public class PaymentService {
	@Autowired
	PaymentFactory factory;
	
	public void paymentOrderService(String paymentType, double amount)
	{
		PaymentMethod paymentMethod = factory.getPaymentMethod(paymentType);
		paymentMethod.processPayment(amount);
	}
}
