class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sanjay Kumar";
		sal = 5000f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) 
	{
		//--create an instance of Employee type
		Employee emp = new Employee();

		//--access the state of instance using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//--access the state of instance using reference and method
		emp.getDetails();

		//--change the state of object using reference
		emp.empno = 101;
		emp.name = "Sanjay";
		emp.sal = 2500f;
		emp.getDetails();

		//--change the state of object using reference and method
		emp.setDetails();
		emp.getDetails();
	}
}
