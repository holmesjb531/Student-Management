import java.util.Scanner;

public class StudentData {

	private String firstName;
	private String lastName;
	private String year;
	private static int costOfCourse = 600;
	private String courses;
	private int tuitionBalance = 0;
	private String studentID;
	private static int id = 1000;
	private boolean tuitionPayed;
	
	public StudentData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student's first name: ");
		this.firstName = sc.nextLine();
		
		System.out.println("Enter the student's last name: ");
		this.lastName = sc.nextLine();
		
		System.out.println("Enter year of the student: ");
		System.out.println("1. Freshman \n2. Sophomore \n3. Junior \n4. Senior \n5. 5+");
		this.year = sc.nextLine();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + year + " " + studentID);
		
	}
	
	private void setStudentID() {
		id++;
		this.studentID = year + "" + id;
	
	}
	
	public void enroll() {
		
		boolean start = true;
		
		while(start) {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			
			if(!course.equals("Q")) {
				courses = course + "\n";
				tuitionBalance = tuitionBalance + costOfCourse;
				
			}else {
				start = false;
				break;
			}
		}
		System.out.println("Course enrolled: " + courses);
		System.out.println("Tuition Balance is: $" + tuitionBalance);
	}
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter payment: ");
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		this.tuitionPayed = isTuitionPayed();
		System.out.println("Thank you for your payment!");
		viewBalance();
	}
	
	public boolean isTuitionPayed() {
		if(this.tuitionBalance == 0) {
			return true;
		}
		return false;
	}
	
	public String showInfo() {
		return "\nSTUDENT'S NAME: " + firstName + " " + lastName +
				"\nYEAR OF STUDENT: " + year + 
				"\nSTUDENT'S ID: " + studentID +
				"\nTUITION PAYED: " + tuitionPayed;
	}
	

	
}
