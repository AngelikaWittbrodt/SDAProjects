package com.sda.api;

import java.util.ArrayList;
import java.util.List;

public class ErastotenesApp {

	public static void main(String[] args) {
		System.out.println(findPrimesOnIntegers(99));
		System.out.println(findPrimesOnBoolean(99));
	}

	public static List<Integer> findPrimesOnIntegers(int limit) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		int[] array = new int[limit];

		array[0] = 0;
		array[1] = 0;
		for (int i = 2; i < limit; i++) {
			array[i] = i;
		}
		for (int i = 2; i < limit; i++) {
			for (int j = 2; j * i < limit; j++) {
				array[i * j] = 0;
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0)
				primeNumbers.add(array[i]);
		}
		return primeNumbers;
	}

	public static List<Integer> findPrimesOnBoolean(int limit) {
		List<Integer> primeNumbers = new ArrayList<Integer>();

		boolean[] array = new boolean[limit];

		array[0] = true;
		array[1] = true;

		for (int i = 2; i < limit; i++) {
			array[i] = false;
		}
		for (int j = 2; j < limit; j++) {
			for (int k = 2; k * j < limit; k++) {
				array[k * j] = true;
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != true)
				primeNumbers.add(i);
		}
		return primeNumbers;
	}
}
