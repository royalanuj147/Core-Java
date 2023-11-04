package Advance_java;
import java.util.*;
public class Array_List2 {
   public static void main(String args[]) {
	   
	   // Declaring the ArrayList 2nd type
	   List<Integer> a = new ArrayList<Integer>();
	   a.add(10);
	   a.add(20);
	   a.add(30);
	   a.add(40);
	   a.add(50);
	   
	   System.out.println(a);
	   System.out.println(a.size());
	   a.remove(2);
	
	   System.out.println(a.size());
	   
   }
}

