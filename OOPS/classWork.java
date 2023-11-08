package OOPS;
//package opps;
//import java.util.Scanner;
//
//class addition{
//	void sum(int a, int b) {
//		System.out.println("sum of "+ (a+b));
//	}
//	
//	void checkGreaterNumber(int a, int b, int c) {
//		if((a!=b || a!=c)) {
//			
//			if(a > b && a >c) {
//				System.out.println("A is greater : "+ a);
//			}
//			else if(b > a && b >c) {
//				System.out.println("B is greater : "+ b);
//			}
//			else if(a > c && a==b) {
//				System.out.println("A is greater "+ a);
//			}
//			else if(b>c && b==c) {
//				System.out.println("B is greater "+ b);
//			}
//			else if(c> a && c==a) {
//				System.out.println("C is greater "+ c);
//			}
//			else {
//				System.out.println("C is greater : "+ c);
//			}
//			
//		}
//		else{
//			System.out.println("All number are equals");
//		}
//	
//	}
//	
//	// HackerRank interview Question with soluation
//	void looping() {
//		int a = 1;
//		for(a=1; a<=15; a++) {
//			if(a%3==0) {
//				System.out.println("Hello");
//			}
//			if(a%5==0) {
//				System.out.println("Welcome");
//			}
//			if(a%2==0 && a%3==0) {
//				System.out.println("Sorry");
//			}
//		}
//	}
//}
//
//// class work 2nd days
//
//class class2nd{
//	int sum(int a, int b) {
//		return a+b;
//	}
//		
//}
//public class classWork {
//	public static void main(String args[]) {
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter first Integer number ");
//			int a = sc.nextInt();
//			System.out.println("Enter Second Integer number ");
//			int b = sc.nextInt();
//			System.out.println("Enter thired Integer number ");
//			int c = sc.nextInt();
//			
//			addition ad = new addition();
//			ad.sum(a, b);
//			ad.checkGreaterNumber(a, b, c);
//			
//			ad.looping();
//			
//			// class2nd objecting creating
//			class2nd c2 = new class2nd();
//			int s = c2.sum(a,b);
//			System.out.println("Sum : "+ s);
//		}
//	}
//}
