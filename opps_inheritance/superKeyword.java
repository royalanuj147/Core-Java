package opps_inheritance;

class Parent{
	int x = 10;
	void show() {
		System.out.println("x is parents class : "+ x);
	}
}

class Child_class extends Parent{
	int x = 100;
	void show() {
		System.out.println("x is child class "+ x);
		System.out.println("this x " + this.x);  // print 100
		System.out.println("super x is "+ super.x); // print 10 parent class variable
		
		super.show(); // call show method on parent class 
	}
}
public class superKeyword {
	public static void main(String arsg[]) {
		Child_class c = new Child_class();
		c.show();	
	}
}
