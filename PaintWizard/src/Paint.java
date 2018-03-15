public class Paint {
	private String name;
	private int litre;
	private double price;
	private int metreSquaredCoverage;
	private int totalCoverage;

	public Paint(String name, int litre, double price, int metreSquaredCoverage) {
		this.name = name;
		this.litre = litre;
		this.price = price;
		this.metreSquaredCoverage = metreSquaredCoverage;
		this.totalCoverage = this.litre * this.metreSquaredCoverage;
	}
	
	public double getPriceForRoom(int roomSize) {
		double amountRequired = Math.ceil(roomSize / this.totalCoverage);
		double costForRoom = amountRequired * this.price;
		
		System.out.println(this.name + " requires " + amountRequired + " cans for " + roomSize + "m^2 and will cost £" + costForRoom);
		return costForRoom;
	}
	
	public int getWasteForRoom(int roomSize) {
		int amountWasted = roomSize % this.totalCoverage;
		
		System.out.println(this.name + " wastes " + amountWasted + "m^2 of paint");
		return amountWasted;
	}
	
	public double getPricePerMetre() {
		double priceByLitre = this.price / this.totalCoverage;
		System.out.println(this.name + " costs £" + priceByLitre + " per 1m^2 of paint");
		return priceByLitre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLitre() {
		return litre;
	}

	public void setLitre(int litre) {
		this.litre = litre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMetreSquaredCoverage() {
		return metreSquaredCoverage;
	}

	public void setMetreSquaredCoverage(int metreSquaredCoverage) {
		this.metreSquaredCoverage = metreSquaredCoverage;
	}
}