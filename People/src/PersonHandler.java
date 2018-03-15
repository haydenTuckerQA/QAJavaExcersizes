import java.util.ArrayList;

public class PersonHandler {
	private ArrayList<Person> people;
	
	public PersonHandler() {
		this.people = new ArrayList<Person>();
	}
	
	public void addPerson(Person person) {
		System.out.println("---Adding---\n" + person.toString());
		this.people.add(person);
	}
	
	public Person findPersonByName(String name) {
		for (Person person : this.people) {
			if (person.getName().equals(name)) {
				System.out.println("---Found---\n" + person.toString());
				return person;
			}
		}
		
		return null;
	}
	
	public void printAllPeople() {
		System.out.println("---All People---");
		for (Person person : this.people) {
			System.out.println(person.toString());
		}
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}
}
