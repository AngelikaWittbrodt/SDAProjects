package com.sda.apps;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.sda.api.ErastotenesApp;

public class EratostensesAppTest {
	@Test
	public void testErastotenes() {
		List<Integer> result = ErastotenesApp.findPrimesOnBoolean(100);
		// List<Integer> result =
		// ErastotenesApp.findPrimesOnIntegers(100);
		//
		/**
		 * Sprawdz czy kazda liczba z primesToCheck zawiera się w result
		 */
		List<Integer> primesToCheck = Arrays.asList(13, 29, 53, 97);

		for (int i = 0; i < primesToCheck.size(); i++) {
			if (!result.contains(primesToCheck.get(i))) {
				fail();
			}
		}

	}
}