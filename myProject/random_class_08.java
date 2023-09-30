package myProject;

import java.util.Random;

public class random_class_08 {
	public static void main(String args[]) {
		
		Random r = new Random();
		System.out.println(r.nextInt()); // any value not fixed the range
		System.out.println(r.nextInt(10)); // under 10 any one number
		System.out.println(r.nextInt(50, 100)); //number between 50 and 100 
		System.out.println(r.nextInt(1000, 9999)); // 4 digit random capcha code 
		System.out.println(r.nextInt(100000, 999999)); // 6 digit random capcha code 
	}

}
