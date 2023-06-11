package co.edureka.java.except;

import java.util.Scanner;

class Calculator {
	public int divNum(int x, int y) {
		if (y == 0) {
			//throw new ArithmeticException();
			throw new ArithmeticException("cannot divide a number by 0");
		}
		int z = x / y;
		return z;
	}
}

public class ThrowTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter first no: ");
		int x = sc.nextInt();

		System.out.print("enter second no: ");
		int y = sc.nextInt();

		Calculator calc = new Calculator();
		try {
			System.out.println("result = " + calc.divNum(x, y));
		} catch (Exception ex) {
			System.err.println("handling exception - " + ex);
			System.err.println("message of exception = " + ex.getMessage());
		}
		System.out.println("------- done -------");

	}

}
