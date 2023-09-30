package myProject;


import java.util.Scanner;

public class user_input_04 {

	public static void main(String args[]) {
		
		String fname ;
		String lname ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first ");
		fname = sc.nextLine();
		
		System.out.println("Enter your last ");
		lname = sc.nextLine();
		
		System.out.println("Your name is "+ fname+" " + lname);
		
	}
}
