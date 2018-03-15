public class Plane extends Vehicle {
	private boolean hasWings;
	
	public Plane(int numberOfSeats, int numberOfWheels) {
		super(numberOfSeats, numberOfWheels);
		this.hasWings = true;
	}
	
	public void takeOff() {
		accelerate();
		System.out.println("Taking Off");
	}
	
	public void land() {
		deccelerate();
		System.out.println("Landing");
	}

	public boolean isHasWings() {
		return hasWings;
	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	@Override
	public void accelerate() {
		System.out.println("Do complicated pilot this, plane goes WHOOOOSH");
	}

	@Override
	public void deccelerate() {
		System.out.println("Do complicated pilot things, plane slows down");
	}
}
