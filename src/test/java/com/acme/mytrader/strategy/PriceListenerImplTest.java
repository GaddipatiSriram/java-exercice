package com.acme.mytrader.strategy;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.price.PriceListenerImpl;

public class PriceListenerImplTest {
	@Mock 
	ExecutionService executionService;
	
	@InjectMocks
	PriceListenerImpl priceListernerImpl;
	
    @Test
    public void testNothing() {
    	Mockito.doNothing().when(executionService).sell(Mockito.anyString(), Mockito.anyInt(), Mockito.anyInt());
    	priceListernerImpl.priceUpdate("aapl", 53);
    }
}
