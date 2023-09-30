
class Simple
{
	void show()
	{
		System.out.println("Hii! Anuj");
	}
}
class next extends Simple{
	void sum(int a,int b) {
		int sum= a+b;
		System.out.println("the sum two number "+sum);	
	}	
}

public class demo {
	public static void main(String args[])
	{
		next aa=new next();
		aa.sum(120, 80);
		aa.show();
	}

}
