import java.util.ArrayList;

public class People {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hayden = new Person("Hayden Tucker", 25, "Trainee");
		Person kea = new Person("Kea Tossavainen", 29, "Software Engineer");
		Person tilly = new Person("Tilly", 11, "Dog");
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(hayden);
		people.add(kea);
		people.add(tilly);
		
		for (Person person : people) {
			System.out.println(person.toString());
		}
		
		System.out.println(findPersonByName(people, "Hayden Tucker").toString());
	}
	
	public static Person findPersonByName(ArrayList<Person> people, String name) {
		for (Person person : people) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		
		return null;
	}
}
