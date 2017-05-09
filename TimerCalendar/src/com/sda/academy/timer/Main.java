package com.sda.academy.timer;

public class Main {

	public static void main(String[] args) {
		
		MyTime mytime = new MyTime();
		MyTime mytime1 = new MyTime(23,59,59);
		MyTime mytime2 = new MyTime(0,0,0);
		
		System.out.println(mytime1.toString());
		System.out.println(mytime1.nextSecond().toString());
		System.out.println(mytime2.previousSecond().toString());
	}

}
