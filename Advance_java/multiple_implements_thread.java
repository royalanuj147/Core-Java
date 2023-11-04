package Advance_java;

class mul_imp implements Runnable{
	String name ;
	mul_imp(String name){
		this.name = name;
	}
	
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				System.out.println(name);
				Thread.sleep(2000);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class multiple_implements_thread {
   public static void main(String args[]) {
	   
	   mul_imp a = new mul_imp("Anuj kumar");
	   mul_imp a2 = new mul_imp("Manish");
	   
	   Thread t = new Thread(a);
	   Thread t2 = new Thread(a2);
	   t.start();
	   t2.start();
	   System.out.println("Id 1 => "+ t.getId());
	   System.out.println("Id 2 => "+ t2.getId());
	
   }
}
