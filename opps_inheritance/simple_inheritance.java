package opps_inheritance;

//super class
class A{
	int x = 10;
	void hello() {
		System.out.println("Hello Anuj");
	}
}
// inherited class A using extends keyword

// sub class
class B extends A {
	int x = 100;
	
	void demo() {
		System.out.println("Demo method ");
	}
}


// main class
public class simple_inheritance {
	public static void main(String args[]) {
		B b = new B();
		b.demo();
        b.hello();
		System.out.println(b.x);
//		System.out.println(b.y);
	}
  
  
}
