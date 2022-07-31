package oops;

public class runnerclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Employee E1 = new Employee();
		

	E1.Name = "Mike";
	E1.EmpId = 1000;
	E1.Department = "HR";
	E1.Display();
	
	Employee E2 = new Employee("Jack", 1001, "Finance");
	E2.Display();

	bank B = new bank();
	
	B.displaybalance();
	int Bal = B.Getbalance();
	B.AccountNum = 500;
	
	System.out.println("The Balance is " + B.Getbalance());
	
	
	BOAbank B1 = new BOAbank();
	
	B1.Getbalance();
	B1.ccbalance();
	
	B1.AccountNum =100;
	System.out.println("The Balance is " + B1);
	
	//overloading 
	
	overloading obj =new overloading ();
	
	int RecArea = obj.GetArea(3, 4);
	
	int SqArea = obj.GetArea(4);
	
	System.out.println ("rec area is:" +RecArea);
	
	System.out.println ("seq area is:"  +SqArea);

Chrome ch =new Chrome();
 ch.OpenBrowser();
 
 Firefox fx= new Firefox();
 fx.OpenBrowser();
 fx.CloseBrowser();
 
 
 Browser br =new Chrome();
 
 br.OpenBrowser();
 br.CloseBrowser();
 br.DisplayName();
 
 
 
 HondaCar c1= new HondaCar();
 
 CarInterface car2= new HondaCar();
 
 EncapsulationEx en= new EncapsulationEx();
 en.setBalance(3000);
 
 System.out.println(en.getBalance());
 
 EncapsulationEx add= new EncapsulationEx();
 Object gokak = null;
add.setAddress(gokak);
 System.out.println(add.getAddress());
 
 
 
	}
}
