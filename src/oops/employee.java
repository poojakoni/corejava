package oops;

public class employee {
//no need add main method 
	
	
	public String name;
	public int empID;
	public String dept;
	
	//created constrctor same name as class but intinalizing parameters
	public employee(String p1, int p2, String p3) {
		
		name=p1;
		empID=p2;
		dept=p3;
	}
	
		public void display() {
		System.out.println(dept);
		System.out.println(name);
		System.out.println(empID);
		
		
	}
}
