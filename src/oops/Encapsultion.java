package oops;

public class Encapsultion {
//select variables and source->generet geteer and setters 
	private int num;
	private String  name;
	private String address;
	
	//generated getter and setter for above private variables
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
