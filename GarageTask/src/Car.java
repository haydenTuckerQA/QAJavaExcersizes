public class Car extends Vehicle {
	private boolean hasBoot;

	public Car(int numberOfSeats, boolean hasBoot) {
		super(numberOfSeats, 4);
		this.hasBoot = hasBoot;
	}
	
	public void beepHorn() {
		System.out.println("BEEP");
	}

	public boolean isHasBoot() {
		return hasBoot;
	}

	public void setHasBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}

	@Override
	public void accelerate() {
		System.out.println("Push the pedal, car goes BROOM");
	}

	@Override
	public void deccelerate() {
		System.out.println("Push the brake pedal, car slows down");
	}
}
