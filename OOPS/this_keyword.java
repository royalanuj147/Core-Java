package OOPS;
class aaa{
	int x=10;
	void call() {
		System.out.println("X is "+ x);
		System.out.println("This x "+ this.x);
		
		show();
		this.show();
	}
	void show() {
		int x = 20;
		System.out.println("Show");
		System.out.println(" x is : "+ this.x ); // 10
		System.out.println(" x is : "+ x );  // 20
	}
}
public class this_keyword {
	public static void main(String args[]) {
		aaa a = new aaa();
		a.call();
	}
}
