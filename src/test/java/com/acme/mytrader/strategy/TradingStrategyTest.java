package com.acme.mytrader.strategy;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.acme.mytrader.execution.ExecutionService;

public class TradingStrategyTest {
	
	@Mock 
	ExecutionService executionService;
	
	@InjectMocks
	TradingStrategy tradingStrategy;
	
    @Test
    public void testNothing() {
    	Mockito.doNothing().when(executionService).sell(Mockito.anyString(), Mockito.anyInt(), Mockito.anyInt());
    	tradingStrategy.executeOrder("aapl", 54, 100);
    }
    
    
}
