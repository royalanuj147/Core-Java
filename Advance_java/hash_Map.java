package Advance_java;

import java.util.HashMap;

public class hash_Map {
	public static void main(String args[]) {
		
		// object create HashMap
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		
		// HashMap method
		a.put(10,"Anuj");
		a.put(10, "raja");
		a.put(11,"Pintu");
		a.put(12,"Shubham");
		a.put(13,"Jitendra");
		a.put(12, "Neha");
		a.put(14,"Rakesh");
		
		System.out.println(a);
		System.out.println(a.get(12));  // show value ('Neha')
		System.out.println(a.size());
	}
}
