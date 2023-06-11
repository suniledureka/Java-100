class Except5 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x / y;
		System.out.printf("%d / %d = %d \n",x, y, z);
	  }
	  catch(Exception ex){
		  System.out.println("an exception occured....");
		  System.out.println("message = " + ex.getMessage());
		  System.out.println("toString() = " + ex.toString()); //exception type : message
		  System.out.println();
		  ex.printStackTrace(); //toString() + callstack
		  System.out.println();

		  if(ex instanceof ArithmeticException){
			  System.out.println("Please provide int type data as cmd args");
		  }
	  }

      System.out.println("----- done -----");
	}
}
