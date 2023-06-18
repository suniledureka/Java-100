package co.edureka.java.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<Integer, Product> products = new HashMap<Integer, Product>();
		
		products.put(101, new Product(3478, "Mobile"));
		products.put(102, new Product(1234, "Memory"));
		products.put(103, new Product(4752, "Keyboard"));
		products.put(104, new Product(1001, "Mouse"));
		products.put(105, new Product(7415, "Cabinet"));
		products.put(101, new Product(3479, "Processor"));
		
		System.out.println(products);
		
		Set<Integer> keys = products.keySet();
		for(Integer key : keys) {
			Product prod = products.get(key);
			System.out.println(prod.getProductName());
		}
		System.out.println();
	}

}
