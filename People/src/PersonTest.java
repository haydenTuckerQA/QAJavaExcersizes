import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	Person person = new Person("Test", 100, "Spaceman");

	@Test
	void testCorrectToString() {
		String testString = "Name: Test Age: 100 Job Title: Spaceman";
		boolean expectedResult = true;
		
		assertEquals(expectedResult, person.toString().equals(testString));
		
		testString = "Incorrect string";
		expectedResult = false;
		
		assertEquals(expectedResult, person.toString().equals(testString));
	}
	
	@Test
	void testIncorrectToString() {
		String testString = "Incorrect string";
		boolean expectedResult = false;
		
		assertEquals(expectedResult, person.toString().equals(testString));
	}
}
