import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class GameBoard {
	private LinkedList<LinkedList<BoardSpace>> theMoor;
	private int[] playerPosition;
	private int[] treasurePosition;
	private boolean endGame;
	private String invalidInput;
	private Scanner scanner;
	private Player player;
	private int treasureFound;
	
	public GameBoard() {
		this.theMoor = new LinkedList<LinkedList<BoardSpace>>();
		this.playerPosition = new int[2];
		this.treasurePosition = new int[2];
		this.endGame = false;
		this.invalidInput = "Your input was not valid. ";
		this.player = null;
		this.treasureFound = 0;
	}

	/**
	 * Initialises the gameboard as a 2d LinkedList of BoardSpace Objects
	 */
	public void initialiseGameboard() {
		for (int row = 0; row < 10; row++) {
			LinkedList<BoardSpace> rowList = new LinkedList<BoardSpace>();
			for (int column = 0; column < 10; column++) {
				rowList.add(new BoardSpace());
			}
			theMoor.add(rowList);
		}
	}
	
	/**
	 * Goes through each BoardSpace on the gameboard and displays the contents of
	 * each space to the user.
	 */
	public void printGameboard() {
		for (int row = 0; row < theMoor.size(); row++) {
			for (int column = 0; column < theMoor.get(row).size(); column++) {
				BoardSpace currentSpace = theMoor.get(row).get(column);
				if (currentSpace.getPlayer() != null && currentSpace.getTreasure() != null) {
					if(this.player.getName() == 'X') {
						System.out.print("T ");
					} else {
						System.out.print("X ");
					}
				} else if (currentSpace.getPlayer() != null) {
					System.out.print(currentSpace.getPlayer().getName() + " ");
				} else if (currentSpace.isHasBeenVisited()) {
					System.out.print("- ");
				} else {
					System.out.print("? ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Used to insert a passed player object into a random position on the gameboard.
	 * @param player The player object to store in the gameboard.
	 */
	public void insertPlayerAtRandomPosition(Player player) {
		this.player = player;
		Random random = new Random();
		this.playerPosition[0] = random.nextInt(this.theMoor.size());
		this.playerPosition[1] = random.nextInt(this.theMoor.get(0).size());
		
		this.theMoor.get(this.playerPosition[0]).get(this.playerPosition[1]).setPlayer(player);
	}

	/**
	 * Inserts a treasure object at a random location on the gameboard, so long as
	 * that position is not the same position as the player.
	 */
	public void insertTreasureAtRandomLocation() {
		Treasure treasure = new Treasure();
		Random random = new Random();
		do {
			this.treasurePosition[0] = random.nextInt(this.theMoor.size());
			this.treasurePosition[1] = random.nextInt(this.theMoor.get(0).size());
		} while (this.treasurePosition[0] == this.playerPosition[0] && this.treasurePosition[1] == this.playerPosition[1]);
		
		this.theMoor.get(this.treasurePosition[0]).get(this.treasurePosition[1]).setTreasure(treasure);
	}

	/**
	 * Runs the game until the player decides they want to stop.
	 */
	public void runGame() {
		System.out.println("You awaken to find yourself in a barren moor!\n");
		printGameboard();
		
		while (!this.endGame) {
			chooseMove();
		}
		
		// Prints the success/failure of the players game
		if (treasureFound > 0) {
			System.out.println("Congratulations " + this.player.getFullName() + "! You found " + this.treasureFound + " treasure!");
		} else {
			System.out.println(this.player.getFullName() + "! You didn't find any treasure!");
		}
	}

	/**
	 * Calculates the distance the player is from the treasure on the gameboard using pythagorus.
	 * @return Returns the distance as a double.
	 */
	private double checkCompass() {
		int heightDifference = (playerPosition[0] - treasurePosition[0]);
		int widthDifference = (playerPosition[1] - treasurePosition[1]);
		
		int difference = (heightDifference*heightDifference) + (widthDifference*widthDifference);
		
		return Math.sqrt(difference);
	}

	/**
	 * Waits for input from the user concerning what move they want to make, if invalid input is received
	 * the player is re-prompted for input.
	 */
	private void chooseMove() {
		this.scanner = new Scanner(System.in);
		boolean validMove = false;
		String input = "";
		
		while (!validMove) {
			System.out.println("You are " + checkCompass() + " spaces away from the treasure!");
			System.out.println("Enter: 'North' / 'East' / 'South' / 'West' to move your character!");
			System.out.println("Enter: 'Look' to observe your surroundings.");
			System.out.println("Enter: 'Stop' to give up and end the game.");
			input = scanner.next();
			if (input.equals("North") || input.equals("East") || input.equals("South") || input.equals("West") || input.equals("Look") || input.equals("Stop")) {
				validMove = true;
			} else {
				System.out.println(invalidInput);
			}
		}
		
		makeMove(input);
	}

	/**
	 * Decides the appropriate action to perform based on the players input
	 * @param input The known to be valid input from the user
	 */
	private void makeMove(String input) {
		int[] newPosition = new int[2];
		
		switch (input) {
			case "North": 	newPosition[0] = playerPosition[0] - 1;
							newPosition[1] = playerPosition[1];
							break;
			case "East": 	newPosition[0] = playerPosition[0];
							newPosition[1] = playerPosition[1] + 1;
							break;
			case "South": 	newPosition[0] = playerPosition[0] + 1;
							newPosition[1] = playerPosition[1];
							break;
			case "West": 	newPosition[0] = playerPosition[0];
							newPosition[1] = playerPosition[1] - 1;
							break;
			case "Look":		look();
							return;
			case "Stop":this.endGame = true;
							return;
		}
		
		if (newPosition[0] != playerPosition[0] || newPosition[1] != playerPosition[1]) {
			movePlayer(newPosition);
		}
	}

	/**
	 * Calculates if the potential new position is with the current size of the gameboard,
	 * if not then the gameboard is increased in size appropriately.
	 * @param newPosition
	 */
	private void movePlayer(int[] newPosition) {
		// If the gameboard is changed then the players and treasures position is changed appropriately
		if (newPosition[0] < 0) {
			System.out.println("Too small North");
			this.theMoor.addFirst(createNewRow());
			newPosition[0] += 1;
			playerPosition[0] += 1;
			treasurePosition[0] += 1;
		} else if (newPosition[0] >= this.theMoor.size()) {
			System.out.println("Too small South");
			this.theMoor.addLast(createNewRow());
		} else if (newPosition[1] < 0) {
			System.out.println("Too small West");
			addNewColumn(true);
			newPosition[1] += 1;
			playerPosition[1] += 1;
			treasurePosition[1] +=1;
		} else if (newPosition[1] >= this.theMoor.get(0).size()) {
			System.out.println("Too small East");
			addNewColumn(false);
		}
		
		/*
		 * Any changes that needed to be made to the gameboard have been made and positions
		 * updated, below the player object is removed from its previous BoardSpace and
		 * inserted into the place it has been moved to.
		 */
		System.out.println("Current Treasures Found: " + this.treasureFound);
		
		BoardSpace oldSpace = this.theMoor.get(playerPosition[0]).get(playerPosition[1]);
		BoardSpace newSpace = this.theMoor.get(newPosition[0]).get(newPosition[1]);
			
		Player player = oldSpace.getPlayer();
		oldSpace.setPlayer(null);
		newSpace.setPlayer(player);
		
		playerPosition[0] = newPosition[0];
		playerPosition[1] = newPosition[1];
			
		printGameboard();
		
		checkEndGame();
	}
	
	/**
	 * Checks for if the player has found the treasure chest, and if so asks if they would like to continue
	 * or stop playing.
	 */
	private void checkEndGame() {
		if (this.theMoor.get(playerPosition[0]).get(playerPosition[1]).getTreasure() != null) {
			this.theMoor.get(playerPosition[0]).get(playerPosition[1]).setTreasure(null);
			this.scanner = new Scanner(System.in);
			String input = "";
			String output = "Would you like to continue playing? Enter: Yes/No";
			this.treasureFound += 1;
			System.out.println("Congratulations " + this.player.getFullName() + ". You have found the treasure!!!");
			
			do {
				System.out.println(output);
				input = this.scanner.next();
				output = invalidInput + output;
			} while (!input.equals("Yes") && !input.equals("No"));
			
			if (input.equals("Yes")) {
				insertTreasureAtRandomLocation();
				printGameboard();
			} else {
				this.endGame = true;
			}
		}
	}

	/**
	 * Adds a new column to the gameboard either at the front or the end
	 * @param True if a column needs to be added to the beggining and false if at the end
	 */
	private void addNewColumn(boolean before) {
		if (before) {
			for (LinkedList<BoardSpace> row : theMoor) {
				row.addFirst(new BoardSpace());
			}
		} else {
			for (LinkedList<BoardSpace> row : theMoor) {
				row.addLast(new BoardSpace());
			}
		}
	}

	/**
	 * Creates a new row the same size as the other rows containing BoardSpace objects
	 * @return Returns the newly created row to be added to the gameboard
	 */
	private LinkedList<BoardSpace> createNewRow() {
		LinkedList<BoardSpace> newRow = new LinkedList<BoardSpace>();
		for (int column = 0; column < this.theMoor.get(0).size(); column++) {
			newRow.add(new BoardSpace());
		}
		return newRow;
	}

	private void look() {
		System.out.println("Grey foggy clouds float oppressively close to you,");
		System.out.println("reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.\n");
		
		printGameboard();
	}

	public LinkedList<LinkedList<BoardSpace>> getTheMoor() {
		return theMoor;
	}

	public void setTheMoor(LinkedList<LinkedList<BoardSpace>> theMoor) {
		this.theMoor = theMoor;
	}

	public int[] getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(int[] playerPosition) {
		this.playerPosition = playerPosition;
	}

	public int[] getTreasurePosition() {
		return treasurePosition;
	}

	public void setTreasurePosition(int[] treasurePosition) {
		this.treasurePosition = treasurePosition;
	}

	public boolean isEndGame() {
		return endGame;
	}

	public void setEndGame(boolean endGame) {
		this.endGame = endGame;
	}

	public String getInvalidInput() {
		return invalidInput;
	}

	public void setInvalidInput(String invalidInput) {
		this.invalidInput = invalidInput;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getTreasureFound() {
		return treasureFound;
	}

	public void setTreasureFound(int treasureFound) {
		this.treasureFound = treasureFound;
	}
}
