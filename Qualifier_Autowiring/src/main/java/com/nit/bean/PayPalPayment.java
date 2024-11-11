package com.nit.bean;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PayPalPayment implements PaymentMethod {

	@Override
	public void payment() {
	System.out.println("This is PayPalPayment..");
		
	}

}
