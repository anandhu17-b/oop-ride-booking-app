package RidingAppUsingOOps_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("===RIDE BOOKING APP");
	System.out.println("Choose Vehicle  Type:");
	System.out.println("1. Car");
	System.out.println("2. Auto");
	int choice = sc.nextInt();
	System.out.println("Enter Distance (in km)");
	double km = sc.nextDouble();
	Vehicle obj = null; ;
	
	
	switch(choice) {
	
	case 1:
		
		obj = new Car();
		obj.setVehicleNumber("KL24T2004");
		obj.setDriverName("Ravi");
		obj.startRide(km);
		obj.calculateFare(km);
		break;
		
		
	case 2:
		
		obj = new Auto();
		obj.setVehicleNumber("KL24T2004");
		obj.setDriverName("Ravi");
		obj.startRide(km);
		obj.calculateFare(km);
		break;
		
		default:
			
			System.out.println("Invalid Choice");
			break;
	

	}
	
	System.out.println("Choose Payment Method");
	System.out.println("1. UPI");
	System.out.println("2. Cash");
	int choice2 = sc.nextInt();
	PaymentMethod p;
	double fare;
	switch(choice2) {
	
	case 1: 
		fare = obj.calculateFare(km);
		p = new UpiPayment();
		p.pay(fare);
		break;
		
	case 2:
	     fare = obj.calculateFare(km);
		p = new CashPayment();
		p.pay(fare);
		break;
		
		default:
			System.out.println("Invalid Choice");
			break;
		
	}
	
	
		
	
	

	}

    }
