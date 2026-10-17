package RidingAppUsingOOps_01;

public class Auto extends Vehicle {
	
	void startRide(double distance) {
		System.out.println("Auto Ride Started with driver Ajayan");
		System.out.println("Vehicle Number: " + getVehicleNumber());
		System.out.println("Distance: " + distance);
	}
	
	double calculateFare(double distance) {
		double totalFare = 60 * distance;
		System.out.println("Total Fare: " + totalFare);
		return totalFare;
	}

}
