package com.sda.api;

import java.util.Arrays;

public class EuclidesApp {

	public static void main(String args[]) throws Exception {
		int[] array = new int[] { 28, 14, 56, 2, 14 };

		System.out.println(findGreatestCommonDivider(64, 12));
		System.out.println(findGreatestCommonDividerForGroup(array));
	}

	public static int findGreatestCommonDividerForGroup(int[] array) throws Exception {

		if (array.length != 5) {
			throw new Exception("Invalid length of array. Expected: 5");
		}
		Arrays.sort(array);
		/* lowest */ /* greatest */
		while (array[0] != array[array.length - 1]) {
			array[array.length - 1] = array[array.length - 1] - array[0];
			Arrays.sort(array);
		}

		return array[0];
	}

	public static int findGreatestCommonDivider(int a, int b) {

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
