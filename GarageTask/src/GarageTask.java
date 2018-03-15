public class GarageTask {
	public static void main(String[] args) {
		Car car = new Car(5, true);
		Motorbike bike = new Motorbike(false);
		Plane plane = new Plane(80, 10);
		Car sportCar = new Car(2, false);
		
		Garage garage = new Garage();
		garage.addVehicle(car);
		garage.addVehicle(bike);
		garage.addVehicle(plane);
		garage.addVehicle(sportCar);
		
		garage.calculateBillList();
		garage.removeVehicleById(1);
		garage.calculateBillList();
		
		garage.removeAllVehiclesByType("Car");
		garage.calculateBillList();
		
		garage.emptyGarage();
		garage.calculateBillList();
		
		car.accelerate();
		car.deccelerate();
		car.beepHorn();
		
		bike.accelerate();
		bike.deccelerate();
		
		plane.takeOff();
		plane.land();
	}
}
