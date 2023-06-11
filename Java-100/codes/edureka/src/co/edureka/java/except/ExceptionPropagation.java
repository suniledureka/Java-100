package co.edureka.java.except;

public class ExceptionPropagation {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		method2();		
	}

	private static void method2() {
		method3();		
	}

	private static void method3() {
		int x = 10;
		int y = 0;		
		int res = x / y;
		System.out.printf("%d / %d = %d \n", x, y, res);				
	}
	
}
