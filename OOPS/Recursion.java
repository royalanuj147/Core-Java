package OOPS;
class rec{
	int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n* fact(n-1);	
	}
	
	int fabonacci(int a, int b, int n) {
		if(n==1 || n==0) {
			return 1;
		}
		int fb = a+b;
		b = a;
		return fb+fabonacci(a, b, n-1);
	}
}

// Second class
class rec2{
	int recersive(int n) {
		if(n==-10) {
			return 1;
		}
		else {
			System.out.println(n);
			return n+recersive(n-1);	
		}
	}
	
	int fabbonacci(int a, int b, int n) {
		if(n==0 ) {
			return -1 ;
		}
		
		else {
			int z = a+b;
			a = b;
			b = z;
			System.out.print(z + "  ");
			return fabbonacci(a,b,n-1);
		}
		
		
	}
}

public class Recursion {
   public static void main(String args[]) {
	   rec r1 = new rec();
	   int n = 6;
	   int f1 = r1.fact(n);
	   System.out.println("factorial "+n+" is :"+f1);
	   
	   
	   // second class access
	   rec2 r2 = new rec2();
	   int a = r2.recersive(10);
	   System.out.println(a);
	   
	   int fb = r2.fabbonacci(0, 1, 10);
	   System.out.println(fb);
	   
   }
}
