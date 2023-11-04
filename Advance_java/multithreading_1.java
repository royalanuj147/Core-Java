package Advance_java;

class thread1 extends Thread{
	public void run() {
		for(int i=1; i<=50; i++) {
			try {
				System.out.println("One :-> "+ i);
		        Thread.sleep(2000);  // 2 second	
			}
			catch(Exception e) {
				
			}
			
		}
	}
}
class thread2 extends Thread{
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("Two :-> "+ i);
		}
	}
}
class thread3 extends Thread{
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("Three :-> "+ i);
		}
	}
}

public class multithreading_1 {
    public static void main(String args[]) {
    	thread1 t1 = new thread1();
    	thread2 t2 = new thread2();
    	thread3 t3 = new thread3();
    	
    	System.out.println("FIRST thread start");
    	t1.start();
    	System.out.println("SECEND thread start");
    	t2.start();
    	System.out.println("THRED thread start");
    	t3.start();
    	
    	// show priority
    	t1.getPriority();
    }
}
