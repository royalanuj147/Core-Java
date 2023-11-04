package Advance_java;
import java.util.*;
public class Array_List {
   public static void main(String args[]) {
	   
	   // Declaring the ArrayList 1st type
	   ArrayList<Integer> a = new ArrayList<Integer>();
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
