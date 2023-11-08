package OOPS;

class child {
	int x = 10;
	
	void show() {
		System.out.println("x = " + x);
	}
	void greet(String name) {
		System.out.println("Hello "+ name);
	}
}

public class encapsulation {
     public static void main(String args[]) {
    	 
    	 child a = new child(); // create class object
    	 
    	 a.show();
    	 System.out.println(a.x);
    	 a.x = 100;
    	 System.out.println(a.x);
    	 
    	 a.show();
    	 a.greet("Anuj");
    	 
     }
}
