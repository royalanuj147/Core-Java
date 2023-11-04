package Advance_java;

public class multithreading2 {
	public static void main(String args[]) {
		
		Thread t = Thread.currentThread(); // object create of thread
		System.out.println(t);
		
		t.setName("Anuj");
		System.out.println(t);
		
		System.out.println(t.getId());   // o/p-> 1
		System.out.println(t.NORM_PRIORITY); // o/p-> 5
		System.out.println(t.MAX_PRIORITY);  // o/p=> 10
		System.out.println(t.MIN_PRIORITY);  // o/p -> 1
		
		t.setPriority(7);
		System.out.println(t);	
	}
}
