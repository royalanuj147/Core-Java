package OOPS;

class temp{
	void call(int a, int b) {
		System.out.println("The first number is "+ a+ " and second number is "+ b);
	}
}

public class no_return_with_parameter {

	public static void main(String args[]) {
		temp t = new temp();
		t.call(36,736);
	}
}
