import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PersonHandlerTest {
	Person testPerson = new Person("Test", 100, "Spacenaut");
	PersonHandler testPersonHandler = new PersonHandler();
	Person incorrect = new Person("No", 0, "Unemployed");
	
	@Test
	void testAddPerson() {
		testPersonHandler.addPerson(testPerson);
		ArrayList<Person> people = testPersonHandler.getPeople();
		
		assertTrue(people.contains(testPerson));
	}

	@Test
	void testFindPersonByName() {
		String name = "Test";
		testPersonHandler.addPerson(testPerson);
		Person person = testPersonHandler.findPersonByName(name);
		
		assertEquals(person, testPerson);
		assertFalse(testPerson.equals(incorrect));
	}
}
