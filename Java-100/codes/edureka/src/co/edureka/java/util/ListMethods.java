package co.edureka.java.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("no of articipants = " + names.size());
		System.out.println("is participants list empty = " + names.isEmpty());
		System.out.println(names + " | size = " + names.size());
		
		names.add("Sunil");
		names.add("Ahila");
		names.add("Anirudh");
		names.add("Sunil");
		names.add("Ashwin");
		names.add("Ravali");
		names.add("Sunil");
		System.out.println(names + " | size = " + names.size());
		
		names.add(1, "Kulbir Singh");
		names.set(1, "KULBIR SINGH");
		System.out.println(names + " | size = " + names.size());
		
		System.out.println();
		System.out.println("indexOf(Sunil) = " + names.indexOf("Sunil"));
		System.out.println("lastIndexOf(Sunil) = " + names.lastIndexOf("Sunil"));
		System.out.println("indexOf(Anil) = " + names.indexOf("Anil")); //-1
		System.out.println(names + " | size = " + names.size());
		System.out.println();
		
		System.out.println("is \"Ashwin\" in list = " + names.contains("Ashwin"));
		
		System.out.println("person at index 1 = " + names.get(1));
		
		System.out.println("names.remove(Sunil) = " + names.remove("Sunil")); //true
		System.out.println("names.remove(0) = " + names.remove(0)); //KULBIR SINGH
		System.out.println(names + " | size = " + names.size());
	}
}