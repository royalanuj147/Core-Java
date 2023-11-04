package Advance_java;

class imp_thread implements Runnable{
	public void run() {
		for(int i=1; i<=37; i++) {
			try {
				System.out.println(i);
				Thread.sleep(2000);
			}
			catch(Exception e){
		}
	 }
  }
}

class imp_thread2 implements Runnable{
	public void run() {
		for(int j=1; j<=20; j++) {
			try {
				System.out.println(10/0);
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}	
	}
}

public class single_implement_thread {
   public static void main(String args[]) {
	   imp_thread a = new imp_thread();
	   imp_thread2 a2 = new imp_thread2();
	   
	   Thread t = new Thread(a); // object Thread class
	   Thread t2 = new Thread(a2);
	   t.start();
	   t2.start();
   }
}

