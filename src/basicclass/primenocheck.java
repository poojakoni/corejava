package basicclass;

public class primenocheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int num=11;
		boolean flag=true;
		for (int index=2;index<num;index++) {
			int rem =num%index;
			if(rem==0) {
				System.out.println("not prime number");
			flag=false;
			break;
			
			}
			else {
				
			
			} //if(flag==true) {
				System.out.println("no is prime");
			
			//}
		}*/
		
		int n=20;
		boolean falg=true;
		for(int i=2;i<n;i++) {
			int rem=n/i;
			if(rem==0) {
				System.out.println("no is not prime");
				 falg = true;
				break;
			}
			if(falg==false) {
				
				System.out.println("no is  prime");
			}
			
		}
	}
	}
	

