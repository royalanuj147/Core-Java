package opps_inheritance;

class interface_demo2 implements second_interface{
	
	public void one() {
		System.out.println("One");
	}
	
	public void two(int a, int b) {
		System.out.println("Sum is " + (a+b));
	}
	
	public int three(int a, int b, int c) {
		int s = a+b+c;
		return s; 
	}
}

public class interface_class2 {
  public static void main(String arsg[]) {
	  interface_demo2 id2 = new interface_demo2();
	  id2.one();
	  id2.two(63, 84);
	  id2.three(10, 20, 30);
  }
}
