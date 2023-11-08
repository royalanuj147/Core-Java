package myProject;
import java.util.Scanner;

public class if_else_06 {
	public static void main(String args[]) {
		
		int x = 3;
		// only if statement
		if(x > 0) {
			System.out.println("True");
		}
		
		// if - else statement 
		if(x < 0) {
			System.out.println("True");
		}
		else {
			System.out.println("Flase");
		}
		
		// if-else-if statement
		
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your current age ");
			int age = sc.nextInt();
			
			if(age <18) {
				System.out.println("You are children because your age is less than 18");
			}
			else if(age >18 && age <60) {
				System.out.println("You are eligible for doing all the work");
			}
			else {
				System.out.println("You are oldest man. because your age is greater than 60");
			}
		}
	}
}
