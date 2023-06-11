package co.edureka.java.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> marks = Arrays.asList(85,74,96,63,80,76,92);
		System.out.println(marks);
		
		iterate1(marks);
		Thread.sleep(1000);
		
		iterate2(marks);
		Thread.sleep(1000);
		
		iterate3(marks);
		Thread.sleep(1000);
		
		iterate4(marks);
		Thread.sleep(1000);
		
		iterate5(marks);
		Thread.sleep(1000);
		
		iterate6(marks);
	}

	private static void iterate1(List<Integer> marks) {
		System.out.println(">>> list iteration using for loop and get() method - only for List implementations");
		for(int i=0; i<marks.size(); i++) {
			Integer n = marks.get(i);
			System.out.print(n + "      ");
		}
		System.out.println("\n");
	}

	private static void iterate2(List<Integer> marks) {
		System.out.println(">>> list iteration using enhanced for loop");
		for(Integer n : marks) {
			System.out.print(n + "      ");
		}
		System.out.println("\n");
	}
	
	private static void iterate3(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext())	{
			Integer n = it.next();
			System.out.print(n + "      ");
		}
		System.out.println("\n");
	}	

	private static void iterate4(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.ListIterator - only for List implementations");
		ListIterator<Integer> it = marks.listIterator();
		while(it.hasNext())	{
			Integer n = it.next();
			System.out.print(n + "      ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n + "      ");
		}
		System.out.println("\n");
	}
	
	private static void iterate5(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		while(en.hasMoreElements())	{
			Integer n = en.nextElement();
			System.out.print(n + "      ");
		}
		System.out.println("\n");
	}
	
	private static void iterate6(List<Integer> marks) {
		System.out.println(">>> list iteration using forEach() method with lambda expression");
		
		//-- approach-1 using Anonymous class concept - ListIterations$1
		marks.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t+"      ");
				try {
					TimeUnit.SECONDS.sleep(1);
				}catch(Exception ex) {}
			}
			
		});
		System.out.println();
		
		//-- approach-2 using Lambda Expression
		marks.forEach((Integer t) -> {
			System.out.print(t+"      ");
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch(Exception ex) {}
		});
		System.out.println();
		
		//-- approach-2 using Lambda Expression
		marks.forEach(t -> System.out.print(t + "      "));
		
		System.out.println("\n");
	}
}
