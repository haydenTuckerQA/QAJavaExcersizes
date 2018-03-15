import java.util.ArrayList;

public class WorkingWithFiles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hayden = new Person("Hayden Tucker", "Trainee", 25);
		Person kea = new Person("Kea Tossavainen", "Software Engineer", 29);
		Person tilly = new Person("Tilly", "Dog", 11);
		Person nigel = new Person("Nigel Tucker", "Carpenter", 50);
		Person claire = new Person("Claire Tucker", "Office Worker", 49);
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(hayden);
		people.add(kea);
		people.add(tilly);
		people.add(nigel);
		people.add(claire);
		
		PersonReaderWriter personReaderWriter = new PersonReaderWriter();
		
		personReaderWriter.writePeopleToFile(people);
		
		personReaderWriter.readPeopleFromFile();
	}
}
