package oops;

public class EncapsulationEx {

	
	private int balance;
	private String name;
	private String address; // private is accesable only in same class, hiding this three class

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
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
	public void setAddress(Object gokak) {
		this.address = (String) gokak;
	}
	

}


