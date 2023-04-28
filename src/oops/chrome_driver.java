package oops;

public  class chrome_driver extends Abstraction {//automatical created override methods here.

	@Override
	public void openbrowser() {
		// TODO Auto-generated method stub
		System.out.println("inside browser");
	}

	@Override
	public void closebrowser() {
		// TODO Auto-generated method stub
		System.out.println("close browser");
	}
	
	public void display() {
		
		System.out.println("with abstraction created normal method, for normal method no need create override");
	}
	
	

}
