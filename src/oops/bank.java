package oops;

public class bank {

	
	public int accountnum;
	
	public void accdisplybalance() {
		
		System.out.println("inside account balance");
	}
	public int getbalance() {
		
		return 100;
		
	}
	//overriding
	
public void creditcardaccount(int accountnum) {
		
		System.out.println("inside bank card");
		
	}

}
