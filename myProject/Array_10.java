package myProject;

public class Array_10 {
	
	public static void main(String args[]) {
		
		int arr[] = {10, 34, 6, 73, 5, 51, 88, 54, 65, 90};
		int even=0;
		int odd=0;
		
		System.out.println("Even number list is ");
		for(int i=0; i<arr.length; i++) {
		
			if(arr[i]%2==0) {
				even+=1;
				System.out.print(arr[i]+" ");
			}
			else {
				odd+=1;
			}
		}
		
		System.out.println("\nTotal Even neumber is peresent this arraty: "+ even);
		System.out.println("Total Odd neumber is peresent this arraty: "+ odd);
		 
		
	}	
}
