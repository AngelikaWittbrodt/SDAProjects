package com.sda.academy.timer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTimeTest {

	private static final int MINUTES_IN_6_HOURS = 360;

	MyTime time;

	@Before
	public void setup() {
		time = new MyTime(12, 0, 0);
	}

	@Test
	public void moduloTest() {
		//System.out.println(-22 % 24);
		final int hourLimit = 24;
		int hourTest =-22;
		//int actualHour = (((hourTest % hourLmit)+hourLimit)=hourLmit)
		int actualHour = hourTest % hourLimit;
		if(actualHour <0){
			actualHour+=hourLimit;
		}
	}

	@Test
	public void testGetThis() {
		System.out.println(time.toString());
	}
	@Test
	public void testInChangeInHour() {
		time = new MyTime (12,0,0);
		for (int i =0; i<13;i++) {
			time.nextHour();
		}
		assertTrue(time.getHour() ==1);
		assertTrue(time.toString().equals("01:00:00"));
		
	}
	
}
