package co.edureka.java.strings;

public class StringMethods1 {

	public static void main(String[] args) {
		String str1 = new String("edureka");
		//String str2 = new String("edureka");
		String str2 = new String("Edureka");
		
		System.out.println("s1==s2 ----> " + (str1==str2)); //false
		System.out.println("equals() ---> " + str1.equals(str2));
		System.out.println("contentEquals() ---> " + str1.contentEquals(str2));
		System.out.println("equalsIgnoreCase() ---> " + str1.equalsIgnoreCase(str2));
	}

}
