package ObjectOrientedProgramming;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatepay() {
		return this.getPay() * 80;
	}
	
}
