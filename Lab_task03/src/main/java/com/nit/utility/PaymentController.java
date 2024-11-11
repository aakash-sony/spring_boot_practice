package com.nit.utility;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PaymentController 
{
	Scanner sc = new Scanner(System.in);
	@Autowired
	PaymentService service;

	public void takingInput() {
		System.out.print("Enter the payment method(credit,upi,cod): ");
		String type = sc.nextLine();
		System.out.println("Enter the amount: ");
		double amount = sc.nextDouble();
		
		service.paymentOrderService(type, amount);
	}
}
