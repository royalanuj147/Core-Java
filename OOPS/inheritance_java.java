package OOPS;

class A{
	void hello(){
		System.out.println("Hello Class A ");	
	}
	
	String greet(String name ) {
		return "Good morning "+name;
		
	}
}

class B extends A{
	void demo () {
		System.out.println("This is a demo method in java ");
	}
	
	void func1() {
		System.out.println("fubction 1");
	}
}

public class inheritance_java{
	public static void main(String args[]) {
		System.out.println("Inheritance classes");
		
		B b = new B();
		b.demo();
		b.func1();
		b.hello();
		String s = b.greet("Royal Anuj");
		System.out.println(s);
	}

}
