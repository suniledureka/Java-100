package co.edureka.java.arrays;

import java.util.Arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {85,76,93,81,77,65,83};
		
		System.out.println("no of subjects = " + marks.length);
		System.out.println();
		
		System.out.println(marks);
		
		System.out.println(Arrays.toString(marks));
		System.out.println();
		
		/*--- array iteration using for loop ---*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-" + (i+1) + " = " + marks[i]);
		}
		System.out.println();
		
		/*--- array iteration using enhanced for / foreach loop ---*/
		System.out.print("marks obtained:    ");
		for(int mark : marks) {
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println(marks[6]);
		System.out.println(marks[7]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
