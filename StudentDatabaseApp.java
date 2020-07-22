import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number of students to enroll: ");
		int numberToEnroll = sc.nextInt();
		
		StudentData[] students = new StudentData[numberToEnroll];
		
		for(int i = 0; i < numberToEnroll; i++) {
			students[i] = new StudentData();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
		}
		
		
	}
}
