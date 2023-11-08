package opps_inheritance;

class Final{
	
	final int x = 100;  // final variable
	
	// final method
	final void call() {
		System.out.println("Finally method ");
		System.out.println(x);
	}
}

class Final_two extends Final{
	
	// cannot override final method
//	void call() {
//		System.out.println("Not override final method");
//	}
	
	void hello(){
//		this.x++;  // final keyword can not be changed extends class
		
		System.out.println("Hello bro!....");
	}
}
public class final_method {
	public static void main(String args[]) {
		Final_two ft = new Final_two();
		ft.call();
		ft.hello();
		
	}
}
