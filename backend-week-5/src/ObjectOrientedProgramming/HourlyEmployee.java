package ObjectOrientedProgramming;

public class HourlyEmployee extends Employee {
	
	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		super(firstName, lastName, pay);
		this.hoursWorked = hoursWorked;
		
	}
	
	@Override
	public double calculatepay() {
		return getPay() * hoursWorked;
	}
}
