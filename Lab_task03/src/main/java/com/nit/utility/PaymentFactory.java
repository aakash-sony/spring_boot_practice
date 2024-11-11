package com.nit.utility;

import org.springframework.stereotype.Component;

import com.nit.sbeans.CODPayment;
import com.nit.sbeans.CreditCardPayment;
import com.nit.sbeans.PaymentMethod;
import com.nit.sbeans.UPIPayment;

@Component("factory")
public class PaymentFactory
{
	PaymentMethod payment;
	
	public PaymentMethod getPaymentMethod(String type)
	{
		if(type.equals("credit"))
		{
			payment = new CreditCardPayment();
		}
		else if(type.equals("upi"))
		{
			payment = new UPIPayment();
		}
		else if(type.equals("cod")){
			payment = new CODPayment();
		}
		else {
			throw new IllegalArgumentException("Invalid payment type..");
		}
		
		return payment;
	}
}
