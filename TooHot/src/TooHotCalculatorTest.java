import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TooHotCalculatorTest {
	TooHotCalculator tooHot = new TooHotCalculator();

	@Test
	void testNotSummerTooCold() {
		boolean isSummer = false;
		boolean expectedResult = false;
		
		for (int temperature = (0 - 100); temperature < 60; temperature++) {
			assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		}
		
		int temperature = 60;
		expectedResult = true;
		assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
	}

	@Test
	void testNotSummerTooHot() {
		boolean isSummer = false;
		boolean expectedResult = true;
		int temperature = 90;
		assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		
		expectedResult = false;
		for (temperature = 91; temperature < 200; temperature++) {
			assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		}
	}
	
	@Test
	void testNotSummerJustRight() {
		boolean isSummer = false;
		boolean expectedResult = false;
		int temperature = 59;
		assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		
		expectedResult = true;
		for (temperature = 60; temperature < 91; temperature++) {
			assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		}
		
		temperature = 91;
		expectedResult = false;
		assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
	}
	
	@Test
	void testSummerTooCold() {
		boolean isSummer = true;
		boolean expectedResult = false;
		
		for (int temperature = (0 - 100); temperature < 60; temperature++) {
			assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		}
		
		int temperature = 60;
		expectedResult = true;
		assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
	}

	@Test
	void testSummerTooHot() {
		boolean isSummer = true;
		boolean expectedResult = true;
		int temperature = 100;
		assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		
		expectedResult = false;
		for (temperature = 101; temperature < 200; temperature++) {
			assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		}
	}
	
	@Test
	void testSummerJustRight() {
		boolean isSummer = true;
		boolean expectedResult = false;
		int temperature = 59;
		assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		
		expectedResult = true;
		for (temperature = 60; temperature < 101; temperature++) {
			assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
		}
		
		temperature = 101;
		expectedResult = false;
		assertEquals(expectedResult, tooHot.isNotTooHot(temperature, isSummer));
	}
}
