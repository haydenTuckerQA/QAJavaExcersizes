import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
		
		writePeopleToFile(people);
		
		ArrayList<Person> readPeople = readPeopleFromFile();
		
		for (Person person : readPeople) {
			System.out.println(person.getName() + ", " + person.getOccupation() + ", " + person.getAge());
		}
	}
	
	public static void writePeopleToFile (ArrayList<Person> people) {
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter("test.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			
			for (Person person : people) {
				bufferedWriter.write(person.getName() + "," + person.getOccupation() + "," + person.getAge() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedWriter != null)
					bufferedWriter.close();

				if (fileWriter != null)
					fileWriter.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
	
	public static ArrayList<Person> readPeopleFromFile() {
		ArrayList<Person> people = new ArrayList<Person>();
		
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader("test.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			String currentLine;
			
			while ((currentLine = bufferedReader.readLine()) != null) {
				String[] personDetails = currentLine.split(",");
				people.add(new Person(personDetails[0], personDetails[1], Integer.parseInt(personDetails[2])));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {

				if (bufferedReader != null)
					bufferedReader.close();

				if (fileReader != null)
					fileReader.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
		return people;
	}
}
