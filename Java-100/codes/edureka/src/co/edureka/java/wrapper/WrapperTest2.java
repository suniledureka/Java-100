package co.edureka.java.wrapper;

public class WrapperTest2 {

	public static void main(String[] args) {
		Long data = Long.valueOf(25L);
		
		byte b = data.byteValue();
		short s = data.shortValue();
		int n = data.intValue();
		long l = data.longValue();
		
		float f = data.floatValue();
		double d = data.doubleValue();
		
		System.out.println(b + " | " + s + " | " + n + " | " + l);
		System.out.println(f + " | " + d);
	}

}
