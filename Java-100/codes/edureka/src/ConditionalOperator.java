
public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 23;
		int y = 34;
		
		int lar = (x > y) ? x : y;
		System.out.println("largest of(" + x + "," + y+") = " + lar);
	}
}