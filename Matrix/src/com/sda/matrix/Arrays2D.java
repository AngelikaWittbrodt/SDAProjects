package com.sda.matrix;

import java.util.Arrays;

public class Arrays2D {

	public void print2DArray(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
	}

	// obliczający iloczyn elementów tablicy dwuwymiarowej.
	public int multiplyElements(int[][] arr) {
		int result = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result *= arr[i][j];
			}
		}

		return result;
	}

	// sumujący elementy parzyste w każdym wierszu tablicy dwuwymiarowej.

	public int sumEvenNumbersInRows(int[][] arry) {

		int[] rowSum = new int[5];
		int sum = 0;
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				if (arry[i][j] % 2 == 0) {
					rowSum[i] += arry[i][j];
				}
			}
		}
		for (int k = 0; k < rowSum.length; k++) {
			System.out.println("Sum in " + k + " row = " + rowSum[k]);
		}
		System.out.println(Arrays.toString(rowSum));
		return rowSum[0];
	}

	// iloczyn elementów parzystych tablicy dwuwymiarowej.

	public int multiplyEvenElements(int[][] arr) {
		int result = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					result *= arr[i][j];
				}
			}
		}
		return result;
	}

	// iloczyn elementów nieparzystych tablicy dwuwymiarowej.
	public int multiplyOddElements(int[][] arr) {
		int result = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 1) {
					result *= arr[i][j];
				}
			}
		}

		return result;
	}

	// obliczający iloczyn elementów podzielnych przez 3 tablicy dwuwymiarowej.
	public int multiplyElementsDividedByThree(int[][] arr) {
		int result = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 3 == 0) {
					result *= arr[i][j];
				}
			}
		}

		return result;
	}

	public int find2DArrayMin(int[][] arr) {
		int min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	// znajdujący maksymalny element tablicy dwuwymiarowej.
	public int find2DArrayMax(int[][] arr) {
		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}

		return max;

	}

}
