public abstract class Vehicle {
	private int id;
	private boolean hasEngine;
	private int numberOfSeats;
	private int numberOfWheels;
	
	public Vehicle (int numberOfSeats, int numberOfWheels) {
		this.hasEngine = true;
		this.numberOfSeats = numberOfSeats;
		this.numberOfWheels = numberOfWheels;
	}
	
	public abstract void accelerate();
	
	public abstract void deccelerate();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isHasEngine() {
		return hasEngine;
	}
	
	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
}
