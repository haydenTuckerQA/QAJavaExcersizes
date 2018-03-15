import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> garage;
	int uniqueId;
	
	public Garage () {
		this.garage = new ArrayList<Vehicle>();
		this.uniqueId = 0;
	}
	
	public void addVehicle(Vehicle vehicle) {
		assignId(vehicle);
		System.out.println("---Added---\n" + vehicle.getClass().getSimpleName() + " ID." + vehicle.getId());
		garage.add(vehicle);
	}
	
	public void removeVehicleById(int id) {
		int i = 0;
		boolean vehicleFound = false;
		
		while (i < this.garage.size() && !vehicleFound) {
			if (this.garage.get(i).getId() == id) {
				vehicleFound = true;
				System.out.println("---Removed---\n" + this.garage.get(i).getClass().getSimpleName() + " ID." + id);
				this.garage.remove(i);
			}
			i++;
		}
		
		if (!vehicleFound) {
			System.out.println("Vehicle doesn't exist!");
		}
	}
	
	public void removeAllVehiclesByType(String type) {
		ArrayList<Vehicle> vehiclesToRemove = new ArrayList<Vehicle>();
		
		for (Vehicle vehicle : this.garage) {
			if (vehicle.getClass().getSimpleName().equals(type)) {
				vehiclesToRemove.add(vehicle);
			}
		}
		
		for (Vehicle vehicle : vehiclesToRemove) {
			removeVehicleById(vehicle.getId());
		}
	}
	
	private void assignId(Vehicle vehicle) {
		vehicle.setId(this.uniqueId);
		this.uniqueId++;
	}
	
	public ArrayList<Double> calculateBillList() {
		ArrayList<Double> billList = new ArrayList<Double>();
		if (this.garage.isEmpty()) {
			System.out.println("---No Vehicles in Garage---");
		} else {
			System.out.println("---Bill List---");
			for (Vehicle vehicle : this.garage) {
				Double bill = calculateBill(vehicle);
				billList.add(bill);
				System.out.println("The price of " + vehicle.getClass().getSimpleName() + " ID." + vehicle.getId() + " is " + bill);
			}
		}
		
		return billList;
	}

	public double calculateBill(Vehicle vehicle) {
		double bill = 0;
		
		if (vehicle instanceof Car) {
			bill = 999.99;
		} else if (vehicle instanceof Motorbike) {
			bill = 499.99;
		} else if (vehicle instanceof Plane) {
			bill = 99999.99;
		}
		
		return bill;
	}
	
	public void emptyGarage() {
		System.out.println("---Emptying Garage---");
		this.garage.clear();
	}
}
