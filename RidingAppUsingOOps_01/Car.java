package RidingAppUsingOOps_01;

public class Car extends Vehicle {
	
	void startRide(double distance) {
		System.out.println("Car Ride Started with driver Ravi");
		System.out.println("Vehicle Number: " + getVehicleNumber());
		System.out.println("Distance: " + distance);
	}
	
	double calculateFare(double distance) {
		double totalFare = 90 * distance;
		System.out.println("Total Fare: " + totalFare);
		return totalFare;
	}

}
