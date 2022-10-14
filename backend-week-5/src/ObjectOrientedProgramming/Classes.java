package ObjectOrientedProgramming;

public class Classes {

	public static void main(String[] args) {
//		StringBuilder name = new StringBuilder();
//		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.firstName = "Layla";
		student1.lastName = "Pierre";
		student1.gradeLevel = 1;
		student1.phoneNumber = "123-456-7890";
		
		student1.introduce();
		System.out.println("---------------------------" + "\n");
		Student student2 = new Student("Elyi", "Pierre");
		student2.introduce();
		System.out.println("---------------------------" + "\n");
		Student student3 = new Student("Natasha", "Pierre", "347-260-2569",12);// this is a much better way to introduce then then the previous ways
		student3.introduce();
	}

}
