package opps_inheritance;

// Parent class
class one{
	int a = 10;
	void one_1() {
		System.out.println("One class, a is : "+ a);
	}
}

// Child class for one
class two extends one{
	int b = 20;
	void two_2() {
		System.out.println("two class, b is : "+ b);
	}
}

// Child class for two
class three extends two{
	int c = 30;
	void three_3() {
		System.out.println("three class, c is : "+ c);
	}
}

// Child class for three
class four extends three{
	int d = 40;
	void four_4() {
		System.out.println("four class, d is : "+ d);
	}
}

// main class
public class multilevel_inheritance {
  public static void main(String args[]) {
	  
	  four f = new four();
	  f.four_4();
	  f.three_3();
	  f.two_2();
	  f.one_1();
	  
	  System.out.println("a is "+ f.a);
	  System.out.println("b is "+ f.b);
	  System.out.println("c is "+ f.c);;
	  System.out.println("d is "+ f.d);
	  
  }

}
