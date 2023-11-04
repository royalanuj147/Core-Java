package exception;

public class try_catch_block {

	public static void main(String args[]) {
		String name = "Royal Anuj";
		try {
			int len = name.length();
			System.out.println(name.charAt(len));
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		//  
		finally {
			System.out.println("Finally Run ");
		}
	}
}
