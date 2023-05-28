package co.edureka.java.arrays;

import java.util.Arrays;

public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 98;
		marks[1] = 72;
		System.out.println("size of array = " + marks.length);
		System.out.println(Arrays.toString(marks));
		
		float []salaries = new float[9];
		System.out.println(Arrays.toString(salaries));
		
		char characters[] = new char[10];
		System.out.println(Arrays.toString(characters));
		
		String[] names;
		names = new String[10];
		for(String name : names) {
			System.out.print(name+" , ");
		}
		System.out.println();
		
		boolean[] status = new boolean[10];
		System.out.println(Arrays.toString(status));
	}

}
