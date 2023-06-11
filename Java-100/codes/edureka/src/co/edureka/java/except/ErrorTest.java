package co.edureka.java.except;

import java.util.ArrayList;
import java.util.List;

public class ErrorTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		System.out.println("adding data ......");
		int i = 1;
		try {
			while (true) {
				list.add(i);
			}
		} catch (Error err) {
			System.out.println(err);
		}
		System.out.println("---- done ----");
	}

}
