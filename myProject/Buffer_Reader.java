package myProject;

import java.io.*; // io package using for input output 

public class Buffer_Reader {
     public static void main(String args[]) throws IOException {
    	 
    	 // input lene ke liye bufferReader class ke use karenge
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 
    	 System.out.println("Enter first number ");
    	 String a = br.readLine();
    	 
    	 System.out.println("Enter Second number ");
    	 String b = br.readLine();
    	 
    	 // convert string to integer
    	 int i = Integer.parseInt(a);
    	 int j = Integer.parseInt(b);
    	
    	 
    	 System.out.println("Sum is : "+ (a+b)); // print concatenation
    	 System.out.println("Sum is : "+ (i+j));
     }
}
