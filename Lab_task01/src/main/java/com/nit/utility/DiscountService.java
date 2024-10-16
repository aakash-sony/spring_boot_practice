package com.nit.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Discount;

@Component
public class DiscountService {
	@Autowired
	@Qualifier("bpd")
	private Discount discount;
	
	public DiscountService() {
		
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
}
