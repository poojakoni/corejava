package basicclass;

public class datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("hello");
	
	int i=10;
	int j=20;
	int sum =i+j;
	
	System.out.println("sum of two numbers" +  sum);
	
	int mul =i*j;
	
	System.out.println("mul of two numbers" + mul);
	
	float div = (float) i/j;
	System.out.println("div of two numbers" + div);
	
	String str="welcome";
	System.out.println(str);
	
	
	System.out.println("length of the string " + str.length());
	
	char ch1 =str.charAt(0);
	System.out.println("the first char is"   +   ch1);
	
	char chn= str.charAt(str.length()-1);
	
	System.out.println("thAT LAST CHAR IS" +  chn);
	
	System.out.println("the string uppercase" + str.toUpperCase());
	System.out.println("the string uppercase" + str.toLowerCase());
			
	
	}

} 
