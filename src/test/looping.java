package test;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=2;
		while(num <=10) { //number 2 4 6 8 10
			if(num==6) {  // no 6 means don't print 
				num=num+2;
				
				
			}
			System.out.println(num);	//print 2,4,8,10 expect 6.
			num=num+2;
			
	
		}// for loop
		
		for(int index=1;index<=10;index++) {
			
			if(index==6) {
				continue;
			}
			
			System.out.println(index);
			
		}
		
		System.out.println("After For Loop");
		
		int[] array1 = {10,20,30,40,50,60};
		
		for(int num1:array1) {
			
			System.out.println(num1);
		}


		// Write the logic to print all the array values using normal for loop

for(int index=0;index<array1.length;index++) {
			
			System.out.println(array1[index]);
		}
		

	}

}
