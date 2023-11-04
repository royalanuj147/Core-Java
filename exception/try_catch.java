package exception;

public class try_catch {
   public static void main(String args[]) {
	   int a = 100;
	   try {
		   System.out.println(a/0);
	   }
	   catch(Exception e) {
		   System.out.println(e);
	   }
	   finally {
		   System.out.println("Always Run");
	   }
   }
     
}
