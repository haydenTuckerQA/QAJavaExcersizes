public class Motorbike extends Vehicle {
	private boolean isMaybeCooler;
	
	public Motorbike(boolean isMaybeCooler) {
		super(1, 2);
		this.isMaybeCooler = isMaybeCooler;
	}

	public boolean isMaybeCooler() {
		return isMaybeCooler;
	}

	public void setMaybeCooler(boolean isMaybeCooler) {
		this.isMaybeCooler = isMaybeCooler;
	}

	@Override
	public void accelerate() {
		System.out.println("Pull the throttle, bike goes VROOOOOM");
	}

	@Override
	public void deccelerate() {
		System.out.println("Pull the brakes, bike slows down");
	}
}
