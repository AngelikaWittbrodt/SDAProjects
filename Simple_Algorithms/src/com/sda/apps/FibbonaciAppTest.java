package com.sda.apps;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sda.api.FibbonacciApp;

public class FibbonaciAppTest {
	@Test
	public void testFibbonacciOnBigArray() {
		
		assertTrue(FibbonacciApp.fibbonacciSeriesOnBigArray(20) == 6765);
		assertTrue(FibbonacciApp.fibonacciSeriesOnSmallArray(20) == 6765);
	}
}
