package co.edureka.java.oops;

public class Employee {
	int empno;	
	String name;	
	float sal;
	
	Employee(){
		System.out.println("******");
		empno = 101;
		name = "Sanjay";
		sal = 5000f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
}
