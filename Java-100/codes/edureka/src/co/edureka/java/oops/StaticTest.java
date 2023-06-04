package co.edureka.java.oops;

public class StaticTest {
	static{
		System.out.println("inside static block");
		System.out.println("static block gets executed before main method");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
	}
	
}
