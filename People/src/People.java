public class People {
	public static void main(String[] args) {
		Person hayden = new Person("Hayden Tucker", 25, "Trainee");
		Person kea = new Person("Kea Tossavainen", 29, "Software Engineer");
		Person tilly = new Person("Tilly", 11, "Dog");
		
		PersonHandler personHandler = new PersonHandler();
		personHandler.addPerson(hayden);
		personHandler.addPerson(kea);
		personHandler.addPerson(tilly);
		
		personHandler.printAllPeople();
		
		personHandler.findPersonByName("Hayden Tucker").toString();
	}
}
