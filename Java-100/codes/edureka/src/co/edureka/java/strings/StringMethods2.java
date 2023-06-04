package co.edureka.java.strings;

import java.util.Arrays;

public class StringMethods2 {

	public static void main(String[] args) {
		String str = "Java is a high Level Programming Language";
		
		String[] words = str.split(" ");
		System.out.println("no of words = " + words.length);
		System.out.println(Arrays.toString(words));
		
		String str1 = String.join(" * ", words);
		System.out.println(str1);
	}

}
