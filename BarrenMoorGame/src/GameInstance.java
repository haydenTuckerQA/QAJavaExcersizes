import java.util.Scanner;

public class GameInstance {
	private String invalidInput = "Your input was not valid. ";
	private Scanner scanner;
	/**
	 * Method checks if a player would like to start a game.
	 * If yes then game setup begins. 
	 * After completing a game or choosing not to play the program halts.
	 */
	public void checkStartGame() {
		System.out.println("Welcome to the Barren Moor!\n\nWould you like to hunt for some treasure?");
		this.scanner = new Scanner(System.in);
		String input = "";
		String output = "Enter: Yes/No";
		
		do {
			System.out.println(output);
			input = scanner.next();
			output = this.invalidInput + output;
		} while (!input.equals("Yes") && !input.equals("No"));
		
		if (input.equals("Yes")) {
			setupGame();
		}
		
		System.out.println("\nQuitting Barren Moor. Thank you for playing!");
		scanner.close();
	}

	/**
	 * Initialises a player, sets up the gameboard and starts the game.
	 */
	private void setupGame() {
		System.out.println("You have elected to brave the Barren Moor!\n");
		
		Player player = new Player(this.scanner);
		player.initialisePlayer();
		
		GameBoard gameBoard = new GameBoard();
		gameBoard.initialiseGameboard();
		gameBoard.insertPlayerAtRandomPosition(player);
		
		gameBoard.insertTreasureAtRandomLocation();
		
		gameBoard.runGame();
	}

	public String getInvalidInput() {
		return invalidInput;
	}

	public void setInvalidInput(String invalidInput) {
		this.invalidInput = invalidInput;
	}
}
