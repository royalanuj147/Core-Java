package opps_inheritance;


abstract class Abs{
	abstract void call();
	
	void show() {
		System.out.println("HEllo Bro ! How are you");
	}
}

class abc extends Abs{
	void call(){
		System.out.println("calling with the hep of 'abc class'");
	}
}

class abc2 extends Abs{
	void call() {
		System.out.println("it is the call function using abc2 class");
	}
}
public class Abstract_class {
	public static void main() {
		abc2 b1 = new abc2();
	    b1.show();   b1.call();
	    
	    
	    abc b = new abc();
	    b.show();  b.call();
	}

}
