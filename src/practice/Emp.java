package practice;

public class Emp extends person {

 float salary;

	Emp(String name, float salary) {
		super(name);
		
		this .salary=salary;
		
		// TODO Auto-generated constructor stub
	}
	
	void display() {
		System.out.println(name + "" + salary);
	}

}
