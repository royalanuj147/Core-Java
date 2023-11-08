package opps_inheritance;

class parents{
	parents(){
		System.out.println("Welcome");
		show();
	}
	void show() {
		System.out.println("Show");
	}
}

class Child extends parents{
	void display() {
		System.out.println("B");
	}
}

public class multilevel_constructor {
	public static void main(String args[]) {
		Child t = new Child();
		t.display();
	}
}
