package ObjectOrientedProgramming;

public class Manager extends Employee {
	
	private double bonusPercentage; //field
	
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) { //constructor
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
	}
	
	@Override
	public double calculatepay() { //method
		return getPay() * 80 * bonusPercentage;
	}
}
