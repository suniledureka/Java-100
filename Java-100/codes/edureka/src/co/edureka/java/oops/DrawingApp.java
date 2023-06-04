package co.edureka.java.oops;

import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape do you want to work with? [1. Rect | 2. Circle]: ");
		int shapeType = sc.nextInt();
		
		Shape sh = null;
		
		switch(shapeType) {
		 case 1:
			sh = new Rectangle("Yellow", 12, 7);
			break;
		 case 2:
			sh = new Circle("Blue", 7.5f);
			break;			
         default:
        	System.err.println("INVALID SHAPE TYPE SELECTED... TRY AGAIN");
        	return;
		}
		
		System.out.println("\n==================== SHAPE SELECTED : " + sh.getClass().getSimpleName().toUpperCase()+ " ====================\n");
		System.out.println("Color of \"" + sh.getClass().getSimpleName() +" is \"" + sh.getColor() +"\"");
		sh.setColor("Red");
		sh.area();
	}
}