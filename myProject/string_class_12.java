package myProject;

public class string_class_12 {
	
	public static void main(String args[]) {
		
		String s = new String("Hello"); // first Approach
		
		String s1 = "Ranchi";           // second Approach
		String s2 = "ranchi";
		
		System.out.println(s.length()); // 5
		System.out.println(s1.equals(s2));  // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s2.toUpperCase()); // RANCHI;
		System.out.println(s2.toLowerCase()); // ranchi;
		System.out.println(s2.replace("ranchi", "Tata"));  // Tata
		System.out.println(s2.indexOf("i"));  // 5
		System.out.println(s2);              // ranchi    
		System.out.println(s2.charAt(0));  // r
		
	}

}
