package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements PaymentMethod {

	@Override
	public void processPayment(double amount) {
		System.out.println("The payment" + amount + " is being processed via UPI");
	}

}
