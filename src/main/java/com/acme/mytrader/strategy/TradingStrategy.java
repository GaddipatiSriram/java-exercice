package com.acme.mytrader.strategy;

import com.acme.mytrader.execution.ExecutionService;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {
	
private ExecutionService executionService;
	
	// This will done by dependency injection in real time
	public TradingStrategy(ExecutionService executionService) {
		super();
		this.executionService = executionService;
	}

	public void executeOrder(String security, double price, int reserveUnits ) {
		// TODO Auto-generated method stub
		
		int units = 100;
		if(reserveUnits > units){
			executionService.sell(security, price, units);
		}
		
	}
}
