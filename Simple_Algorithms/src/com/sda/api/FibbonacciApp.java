package com.sda.api;

public class FibbonacciApp {

	public static void main(String[] args) throws Exception {

		fibbonacciSeriesOnBigArray(20);
		fibonacciSeriesOnSmallArray(20);
	}

	public static int fibbonacciSeriesOnBigArray(int index) {

		if (index >= 47 || index <= 0) {
			System.out.println("Incorect index.");
			return 0;
		}

		int[] array = new int[index];

		array[0] = 1;
		array[1] = 1;

		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		System.out.println(index+"th number of Fibonacci Series is: "+array[index-1]);
		return array[index-1];

	}

	public static int fibonacciSeriesOnSmallArray(int index) {

		int[] array = new int[3];
		array[0] = 1;
		array[1] = 1;

		for (int i = 2; i < index; i++) {
			array[2] = array[1] + array[0];
			array[0] = array[1];
			array[1] = array[2];

		}
		System.out.println(index+"th number of Fibonacci Series is: "+array[2]);
		return array[2];
	}
}
