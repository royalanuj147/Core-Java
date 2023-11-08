package opps_inheritance;

class A1 {
	void show() {  // override
		System.out.println("A ");
	}
	void show(int x) {
		System.out.println("x is A "+ x);
	}
}

class B1 extends A1{
	void show() {  // called
		System.out.println("B");
	}
}
public class method_overriding {
	public static void main(String arsg[]) {
		B1 b = new B1();
		b.show();
		b.show(50);
	}

}
