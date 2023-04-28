package basicclass;

public class reverse_string_and_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str="clean world green world";
String result=" ";

for(int i=str.length()-1;i>=0;i--) {
	
	char ch=str.charAt(i);
	result=result+ch;
}
	System.out.println(result);
	
	
 int num=456789;
 int res=0;
 while(num>0) {
 int rem=num%10;
 
 res=res*10+rem;
 num=num/10;
 
 
 
}System.out.println(res);

//patteren 
/*for(int i=1;i<5;i++) {
	
	int j=1;
	
	while(j<=i) {
		System.out.print("*");
		j++;
	}System.out.println();
}*/

	}}
