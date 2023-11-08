package OOPS;

class staticClass{
	int x=10;
	static int y = 20;
	
	void show() {
		System.out.println("X + y : "+ (x+y));
	}
	
	//static function
	// access only static variable
	static void call() {
		System.out.println("y is : "+ y);
//		System.out.println("x is : "+ x); // throw Error because access only static variable
	}
}
public class static_function {
	public static void main(String args[]) {
		
		staticClass sc = new staticClass();
		sc.show();
		sc.show();
		
		staticClass.call(); // static function access by the class name. not access by the object 
		System.out.println(staticClass.y); // static variable access by the class name. not access by the object
			
	}
}
