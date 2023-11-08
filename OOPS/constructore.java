package OOPS;

class constructore_class{
	int n;
	//default constructor
	constructore_class(){
		n =10;
	}
	//Parameterized constructor
	constructore_class(int p){
		n = p;
	}
	void call() {
		System.out.println("n is : "+ n);
	}
}
public class constructore {
	public static void main(String args[]) {
		//for default constructor
		constructore_class cc = new constructore_class();
		
		//Parameterized constructor
		constructore_class cc1 = new constructore_class(100); // argument passing for construcutore
		 
		cc.call();
		cc1.call();
		
	}

}
