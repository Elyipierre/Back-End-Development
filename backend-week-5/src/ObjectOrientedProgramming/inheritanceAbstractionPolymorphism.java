package ObjectOrientedProgramming;

public class inheritanceAbstractionPolymorphism {

	public static void main(String[] args) {
		
		Employee salary = new SalariedEmployee("Natasha", "Pierre", 2500.00);
		Employee hourly = new HourlyEmployee("Layla", "Pierre", 60.00, 75.5);
		Employee manager = new Manager("Elyi", "Piere", 4500.00, 15.5);
		
		System.out.println(salary.calculatepay());
		System.out.println(hourly.calculatepay());
		System.out.println(manager.calculatepay());
		
	}

}
