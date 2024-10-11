package com.nit.bean;

import org.springframework.stereotype.Component;

@Component("creditcard")
public class CreditCartPayment implements PaymentMethod {

	@Override
	public void payment() {
	System.out.println("This is CreditCard Payment");
		
	}

}
