package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentsProcessor {

	@Autowired
	@Qualifier("creditcard")
	private PaymentMethod method;

	public PaymentMethod getMethod() {
		return method;
	}

	public void setMethod(PaymentMethod method) {
		this.method = method;
	}
	
	public void display()
	{
		method.payment();
	}
}
