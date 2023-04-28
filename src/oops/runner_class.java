package oops;

public class runner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//created object and displyaed
	/*	employee ep=new employee();
		ep.dept="testing";
		ep.empID=100;
		ep.name="pooja";
		
		
		System.out.println(ep.dept);
		System.out.println(ep.name);
		System.out.println(ep.empID);
		
		employee ep1=new employee();
		ep1.dept="java";
		ep1.empID=220;
		ep1.name="viraj";
		ep1.display();//created display class in emloyee 
		*/
		
		//with constractor and parameters with short code can write code
		employee e3=new employee("kamal" ,434 ,"vtu") ;
				e3.display();
				
				//object for bank class
				
				bank ba=new bank();
				ba.accdisplybalance();
				
				int bal=ba.getbalance();
				System.out.println("the balance of account" + bal);
				
				
				//object for BOAbank(inheritance)
				child_BOAbank bo=new child_BOAbank();
				bo.cccardbalance();
				bo.accdisplybalance();//this is parent class but can use in child class
				
				//creating onject for grandchild class
				
				granscgild_AXIS ax=new granscgild_AXIS();
				ax.accountholdername();
				ax.accdisplybalance();
				
				//overloading
				
				overloading ov=new overloading();
				int rectanglearea=ov.Getarea(3,4);
				
				System.out.println("rectanglearea ="+ rectanglearea);
				
				int squrearea =ov.Getarea(3);
				System.out.println("squrearea= "+ squrearea);
				
				//overriding
				
				bank bank=new bank();
				bank.creditcardaccount(123456);
			
				
				overriding over=new overriding();
				over.creditcardaccount(345666);
				
				//abstaract class
				 chrome_driver ch=new  chrome_driver();
				 ch.closebrowser();
				 ch.openbrowser();
				 ch.display();//child class method only access in child class not in parent class
				 
				 //can't create object for parent abstract class but can create using child class
				 
			//	 Abstraction ab =new Abstraction(); ->it won't implement or can't create object
				 
				 Abstraction ab=new  chrome_driver(); //->using child class can create object 
				 ab.closebrowser();
				 ab.openbrowser();
				 
				 
				 //interface for object
				 
				 implemting_interface_car car=new implemting_interface_car();//object for child class
				 
				 
				// CarInterface cr=new CarInterface();//not work solution is 
				 
				 CarInterface nw=new implemting_interface_car(); //using child classs can create object for parent class
				 
				 
				 // Encapsultion:using private method hiding implemntion part and only ecuting code geteer and stere  creating object
				 
				 Encapsultion en=new Encapsultion();
				 en.setNum(1000); //to give input using set
				 System.out.println("naum is" + en.getNum()); //to print using get
				 
				 
				 
				 
				
	}

}
