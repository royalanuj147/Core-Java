package myProject;

import java.util.Scanner;

public class if_else_if_Nested_07 {
	public static void main(String args[]) {
		
		int x = 3;
		
		if(x<0) {
			System.out.println("x<0");
		}
		else if(x!=3) {
			System.out.println("x!=3");
		}
		else if(x<10) {
			System.out.println("x<10");
		}
		else if(x>0) {
			System.out.println("x>0");
		}
		else {
			System.out.println("Try again!");
		}
		
		
		// check through the age 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current age ");
		int age = sc.nextInt();
		
		if(age <18) {
			System.out.println("You are children because your age is less than 18");
		}
		else if(age >18 && age <40) {
			System.out.println("You are eligible for doing all the work");
		}
		else if(age >40 && age <60) {
			System.out.println("You age under 60 and greater then 40");
		}
		else if(age >60 && age <100) {
			System.out.println("Your age is greater than 60 and less than 100");
		}
		else {
			System.out.println("Rest in peace! because Your age is greater than 100");
		}
		
		
		/// Nested if else statement
		
		int a = 12;
		if(a< 5) {
			
			if(a!= 12) {
				
				if(a<= 19) {
					System.out.println("true");
				}
				
				else {
					System.out.println("flase");
				}
			}
			else {
				System.out.println("a == 20");
			   }
			
			}
		else {
			System.out.println("a < 5");
		   }
		}
	}
	


