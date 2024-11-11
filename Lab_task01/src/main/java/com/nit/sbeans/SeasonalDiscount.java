package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("sd")
public class SeasonalDiscount implements Discount {

	@Override
	public void applyDiscount(double originalPrice) {
		double finalPrice = (originalPrice) - originalPrice * 20 / 100;
		System.out.println("Final Price after seasonal discount: " + finalPrice);
	}

}
