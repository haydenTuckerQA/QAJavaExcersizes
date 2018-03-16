import java.util.Scanner;

/**
 * Represents a player with its own name (also as a char for use in the game)
 */
public class Player {
	private char name;
	private String fullName;
	Scanner scanner;
	
	public Player(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void initialisePlayer() {
		System.out.println("Enter the name for your character.");
		System.out.println("The first character of this will indicate your position in the Barren Moor.");
		
		scanner = new Scanner(System.in);
		this.fullName = scanner.next();
		
		if (fullName.equals("")) {
			fullName = "Player";
		}
		
		this.name = fullName.charAt(0);
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
