package Advance_java;

class thread extends Thread{
	
	public void run() {
		for(int n=0; n<=10; n++) {
			   
			   try {
				   System.out.println(n);
				   Thread.sleep(2000);  // 2 sec
			   }
			   catch(Exception e) {
				   System.out.println(e);
			   }
		   }
	}
	  
}
public class single_thread {
	public static void main(String args[]) {
		thread t = new thread();
		t.start();
	}
 
}
