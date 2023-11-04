package Advance_java;

class thread_1 extends Thread{
	String name;
	
	// constructor
	thread_1(String name){
		this.name = name;
	}
	
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				System.out.println(name);
				Thread.sleep(2000);  // 2 second
			}
			catch(Exception e) 
			{	
		    }
		}
	}
}
public class multi_thread_with_constructor {
       public static void main(String args[]) throws InterruptedException  {
    	   
    	   // creating three thread
    	   thread_1 t1 = new thread_1("Anuj");
    	   thread_1 t2 = new thread_1("Shubham");
    	   thread_1 t3 = new thread_1("Rajan");
    	   
    	   t1.start(); t1.join(); // join method pahle thread 1 pura run karega 
    	   t2.start(); 
    	   t3.start();
       }
}
