package week2;

public class javaWeek2Lab {

	public static void main(String[] args) {
		int age = 14;
		
		System.out.println(age >= 16);
		age = 4;
		System.out.println(age >=16);

		boolean hasLicense = true;
				
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		double costOfMilk = 3.15;
		int thirstLevel = 7;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		}  else {
			System.out.println("No Thanks");
		}
		
		int numberOfCookies = 10;
		int numberOfChildren = 4;
		
        int remainingCookies = numberOfCookies % numberOfChildren;
		
		if (remainingCookies > 5) {
			System.out.println("Jackpot!");
		} else if (remainingCookies >= 2) {
			System.out.println("Whoohooo!");
		} else if (remainingCookies  > 0 ) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
		    case "SILVER":
		    	loyaltyMemberDiscount = .1;
		    	break;
		    case "GOLD":
		    	loyaltyMemberDiscount = .15;
		    	break;
		    case "PLATINUM":
		    	loyaltyMemberDiscount = .25;
		    	break;	
		}
			
		System.out.println(loyaltyMemberDiscount);
		
		
		double billTotal = 640.50;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				       loyaltyMemberStatus = "PLATINUM";
			}
			System.out.println(loyaltyMemberStatus);
		}
		
		
		String username = "Tommy123";
		String password = "12345";
		
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("Login Successful");	
		} else {
			System.out.println("Access Denied");
		}
		
		for (int x = 0; x < 10; x++) {
			System.out.println(x);
		}	
		
		for (int y = 10; y >= 0; y--) {
			System.out.println(y);
		}
		
		for (int z = 0; z <= 100; z++) {
			if (z % 2 == 0) {
				System.out.println(z);
			}
			
		for ( int a = 0; a <= 100; a++) {
			if (a % 2 == 0) {
				System.out.println(a + " EVEN");
			} else {
				System.out.println(a + " ODD");
			}
			}
		}
		
		int i = 100;
		while (i>0) {
			System.out.println(i + " " + (i % 3));
			i--;
		}
	}

}
