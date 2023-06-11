package co.edureka.java.util;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Library1 {

	public static void main(String[] args) {
		List<Book> library = Arrays.asList(
					new Book(101, "Python"),
					new Book(102, "Microsoft"),
					new Book(103, "Java"),
					new Book(104, "React")
				);
		
		displayLibraryStock(library);
	}

	private static void displayLibraryStock(List<Book> library) {
		System.out.println("\n================ EDUREA LIBRARY ================");
		
		library.forEach(book -> {
			System.out.println(book);
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch(Exception ex) {}
		});
		
		//library.forEach(book -> System.out.println(book));
		
	}

}
