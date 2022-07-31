package test;

public class datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20;
		int num2=30;
		
		int sum = num1+num2;
		int mul= num1*num2;
		float div = (float) num1/num2;
		
		System.out.println("sum of two numbers" + sum);
		System.out.println("mul of two numbers" + mul);
		System.out.println("div of two numbers" + div);
		
		String str1 = "work is worship";
		
		System.out.println(str1);
				
System.out.println("the length of string is " + str1.length());

		char ch1 = str1.charAt(0);
			System.out.println("The first char is " + ch1);
			
			char ch2 = str1.charAt(str1.length()-1);
			System.out.println("The last char is " + ch2);
			
			
			System.out.println("the string is in upper case " +str1.toUpperCase());
			System.out.println("the string is in lower case " +str1.toLowerCase());
	}

}
