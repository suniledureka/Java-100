package co.edureka.java.util;

public class Test {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";
		
		int n = s1.compareTo(s2);
		System.out.println(n); //0
		
		s1 = "ABC";
		s2 = "ADA";
		n = s1.compareTo(s2);
		System.out.println(n); //66-68 = -2
		
		s1 = "ADC";
		s2 = "ABA";
		n = s1.compareTo(s2);
		System.out.println(n); //68-66 = 2		
	}

}
