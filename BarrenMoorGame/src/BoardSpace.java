/**
 * A BoardSpace object represents a space on the game board. It can hold both a player and a
 * treasure object and shows if the player has visited this space previously.
 */
public class BoardSpace {
	private Player player;
	private Treasure treasure;
	private boolean hasBeenVisited;
	
	public BoardSpace () {
		this.player = null;
		this.treasure = null;
		this.hasBeenVisited = false;
	}
	
	public boolean isEmpty() {
		return (player == null && treasure == null);
	}

	public Player getPlayer() {
		return player;
	}

	/**
	 * Add a player to the boardspace and also shows that this space has been visited by the player.
	 * @param player
	 */
	public void setPlayer(Player player) {
		this.hasBeenVisited = true;
		this.player = player;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public void setTreasure(Treasure treasure) {
		this.treasure = treasure;
	}

	public boolean isHasBeenVisited() {
		return hasBeenVisited;
	}

	public void setHasBeenVisited(boolean hasBeenVisited) {
		this.hasBeenVisited = hasBeenVisited;
	}
}
