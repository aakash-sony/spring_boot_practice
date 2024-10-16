package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements ITyre{

	@Override
	public void rotate() {
	System.out.println("BridgeStone Tyres rotate faster.");	
	}

}
