package co.edureka.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prodObj = new Product();
		
		prodObj.setProductId(8574);
		prodObj.setProductName("Mobile Phone");
		prodObj.setProductPrice(72000f);
		
		System.out.println(prodObj.getProductId() + " | " + prodObj.getProductName() + " | " + prodObj.getProductPrice());
		
		System.out.println("prodObj is of type --> " + prodObj.getClass().getName());
		System.out.println("prodObj is of type --> " + prodObj.getClass().getSimpleName());
		System.out.println("hashCode() --> "+ prodObj.hashCode());
		System.out.println("hashCode() in hexa_decimal form --> " + Integer.toHexString(prodObj.hashCode()));
		System.out.println();
		
		System.out.println(prodObj); //toString()
	}

}
