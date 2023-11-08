package opps_inheritance;

class interface_demo implements first_interface{
	public void demo(){
		System.out.println("Interface demo function");
	}
}

public class interface_class {	
	public static void  main(String arsg[]) {
		interface_demo id = new interface_demo();
		id.demo();
		
		
	}
}
