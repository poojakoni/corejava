package test;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner =new Scanner(System.in);
System.out.println("enter the no:");

int num =scanner.nextInt();
if(num%2==0) {
	System.out.println("even no");
	
}
else {
	System.out.println("odd no");
}	
		
	}

}
