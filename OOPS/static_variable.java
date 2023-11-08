package OOPS;


class static_var{
	int x = 10;  // instance variable
	static int y = 20;  // static variable
	   
	void show() {
		int z=10;  // local variable
		
		System.out.println("sum : "+ (x + y + z));
		x++;
		y++;
		z++;
	}
}
public class static_variable {
   public static void main(String args[]) {
	   static_var s = new static_var();
	   s.show();
	   s.show();
	   s.show();
	   
	   System.out.println(s.x);
	   System.out.println(static_var.y); //static variable access by the class name not access by the object
	   
   }
}
