package com.sda.apps;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sda.api.EuclidesApp;

public class EuclidesAppTest {

	@Test
	public void testEuclides4Two(){
		assertTrue(EuclidesApp.findGreatestCommonDivider(5, 10) == 5);
		assertTrue(EuclidesApp.findGreatestCommonDivider(10, 10) == 10);
		assertTrue(EuclidesApp.findGreatestCommonDivider(20, 10) == 10);
	}
	
	@Test
	public void testEuclides4five() throws Exception{
		assertTrue(EuclidesApp.findGreatestCommonDividerForGroup(new int[]{1,1,1,1,1}) == 1);
	}
	
	@Test(expected = Exception.class)
	public void testEuclides4fiveException() throws Exception{
		EuclidesApp.findGreatestCommonDividerForGroup(new int[]{1,1,1});
	}
}
