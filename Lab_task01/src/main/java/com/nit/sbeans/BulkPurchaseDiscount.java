package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("bpd")
public class BulkPurchaseDiscount implements Discount {

	@Override
	public void applyDiscount(double originalPrice) {
		double finalPrice = 0.0;
		if (originalPrice > 100) {
			finalPrice = originalPrice - originalPrice * 10 / 100;
		} else {
			finalPrice = originalPrice;
		}
		System.out.println("Final Price: "+finalPrice);
	}

}
