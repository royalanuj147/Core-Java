package OOPS;

class arr_pass{
	void call(String s, int data[]) {
		System.out.println(s);
		
		//for each loop 
		for(int a:data) {
			System.out.println(a);
		}
	}
	
	void demo(int arr[]) {
		System.out.println("demo class");
		
//		for each loop
		for(int a: arr) {
			System.out.println(a);
		}
	}
}
public class Array_passing {
	public static void main(String args[]) {
		arr_pass ap = new arr_pass();
		
		int arr[] = {10,20,30,40,50};
		int arr2[] = {63,82,6,85,75,90,83,76,82,849,83};
		ap.call("Anuj", arr);
		ap.demo(arr2);
	}
}
