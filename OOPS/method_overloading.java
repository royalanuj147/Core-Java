package OOPS;

// polymorphism part 

class overloading{
	void call() {
		System.out.println("call");
	}
	void call(int a) {
		System.out.println("a is : "+ a);
	}
	void call(int a, int b) {
		System.out.println("a is : "+ a + " b is : "+ b);
	}
	void call(int a, int b, int c) {
		System.out.println("a is : "+ a + " b is : "+ b+" c is : "+ c);
	}
}

public class method_overloading {
	public static void main(String args[]) {
		
		overloading ov = new overloading();
		ov.call();
		ov.call(74);
		ov.call(64, 46);
		ov.call(73, 62, 88);	
	}
}
