package week2;

public class expenseApp {

	public static void main(String[] args) {
		int moneyInBank = 2800;
		int rentDue = 1600;
		int carPayment = 475;
		int food = 500;
		int brokeOrNot = moneyInBank - rentDue - carPayment - food;
		int exp = rentDue + carPayment + food;
		System.out.println("your monthly expense is $" + exp);
		System.out.println("You currently have $" + brokeOrNot + " left in your bank account");
		
		if (moneyInBank >= exp) {
			System.out.println("You have enough money this week");
		}else {
			System.out.println("You may need to borrow some money");
		}
	}

}
