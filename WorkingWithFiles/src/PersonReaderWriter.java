import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersonReaderWriter {
	public void writePeopleToFile (ArrayList<Person> people) {
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
		
		System.out.println("---People Written to File---");
		printAllPeople(people);
	}
	
	public ArrayList<Person> readPeopleFromFile() {
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
		
		System.out.println("---People Read from File---");
		printAllPeople(people);
		
		return people;
	}
	
	private void printAllPeople(ArrayList<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName() + ", " + person.getOccupation() + ", " + person.getAge());
		}
	}
}
