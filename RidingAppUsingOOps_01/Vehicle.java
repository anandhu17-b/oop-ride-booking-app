package RidingAppUsingOOps_01;

abstract class Vehicle {
	
	private String vehicleNumber;
	private String driverName;
	
	abstract void startRide(double distance);
	
	abstract double calculateFare(double distance);
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getdriverName() {
		return driverName;
	}

}
