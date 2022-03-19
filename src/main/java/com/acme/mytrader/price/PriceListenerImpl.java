package com.acme.mytrader.price;

import com.acme.mytrader.execution.ExecutionService;

public class PriceListenerImpl implements PriceListener{
	
	private ExecutionService executionService;
	
	// This will done by dependency injection in real time
	public PriceListenerImpl(ExecutionService executionService) {
		super();
		this.executionService = executionService;
	}



	@Override
	public void priceUpdate(String security, double price) {
		// TODO Auto-generated method stub
		
		double specifiedPrice = 55; // will be dynamic from input or db
		int units = 100;
		if(price < specifiedPrice){
			executionService.buy(security, price, units);
		}
		
	}

}
