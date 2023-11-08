package opps_inheritance;


//final class demo
class demo
{
	int x = 100;
}

 class demo2 extends demo{  // cannot be extends final class
	void hello() {
		System.out.println("x is : " + this.x);
	}
	
}
public class final_class {
	public static void main(String arsg[]) {
		demo2 d2 = new demo2();
		d2.hello();
	}
}
