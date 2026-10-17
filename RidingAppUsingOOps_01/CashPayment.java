package RidingAppUsingOOps_01;

public class CashPayment implements PaymentMethod  {
	
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using Cash Payment");
		
	}
}


