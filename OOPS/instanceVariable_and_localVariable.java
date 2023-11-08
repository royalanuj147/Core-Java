package OOPS;


class instance_variable{
	int x = 10;   //instance variable
	
	void show() {
		int y=20;  // Local variable
		System.out.println("x+y : "+ (x+y));
		System.out.println("y : "+y);  // not increment this variable
		x++; 
		y++;   // not increment
		System.out.println("y : "+y);
	}
	
}
public class instanceVariable_and_localVariable {
	public static void main(String args[]){
		instance_variable iv = new instance_variable();
		iv.show();
		iv.show();
		iv.show();
		System.out.println(iv.x);
		
		
		
	}	
}
