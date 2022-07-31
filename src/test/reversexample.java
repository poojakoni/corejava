package test;

public class reversexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World";
		String res="";
		
		for(int i = str.length() -1 ; i>=0;i--) {
			char ch = str.charAt(i);
			res = res + ch;

		}

		System.out.println("The result string is " + res);

int num = 456789;
		
		int res1 = 0;
		
		while(num>0) {
			
			int rem = num%10; //4
			
			res1 = res1*10 + rem; //987654
			
			num = num/10;  //0
			
		}
		
		System.out.println("The resulted num is " + res1);

		

	}

}
