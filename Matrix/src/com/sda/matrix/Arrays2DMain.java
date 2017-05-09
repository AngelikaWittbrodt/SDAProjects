package com.sda.matrix;

public class Arrays2DMain {

	public static void main(String[] args) {

		Arrays2D array = new Arrays2D();

		int[][] arry = { { 1, 2 }, { 2, 3 }, { 4, 10 }, { 6, 7 }, { 8, 21 } };

		array.sumEvenNumbersInRows(arry);
		System.out.println("\nIloczyn elementów parzystych w tablicy wynosi: " + array.multiplyElements(arry));
		System.out.println("\nIloczyn elementów nieparzystych w tablicy wynosi: " + array.multiplyOddElements(arry));
		System.out.println("\nIloczyn elementów podzielnych przez trzy w tablicy wynosi: "
				+ array.multiplyElementsDividedByThree(arry));
		System.out.println("\nMinimalna wartość w tablicy wynosi: " + array.find2DArrayMin(arry));
		System.out.println("\nMaksymalna wartość w tablicy wynosi: " + array.find2DArrayMax(arry));
	}

}
