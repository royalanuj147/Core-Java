package opps_inheritance;

class AAA{
	AAA(int a, int b, int c){
		System.out.println(a+b);
	}
}
class BBB extends AAA{
	int z;
	BBB(int i, int j, int k)
	{
		super(i,k, j);  // constructor call AAA class
		z = k;
		
		System.out.println((i+j+k));
	}
}
public class super_with_constructor {
    public static void main(String args[]) {
    	BBB b = new BBB(10,20,30);
    }
}
	
