package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("ld")
public class LoyaltyDiscount implements Discount {

	@Override
	public void applyDiscount(double originalPrice) {
		double finalPrice = originalPrice - originalPrice * 15 / 100;
		System.out.println("Final price after loyalty discount: "+finalPrice);
	}

}
