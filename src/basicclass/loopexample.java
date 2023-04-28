package basicclass;

public class loopexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=2;
		while(num<=10) {
			if(num==6) {
				num=num+2;
				//continue;
		break;
			} System.out.println(num);
			
		
		num=num+2;     //or num=num+1
		}
System.out.println("after break");

for(int i=1;i<=10;i++) {
	if(i==6) {
		continue;
	}
	System.out.println(i);
}

int[]array1= {10,20,30,40,50,60};

for(int num1:array1) {
	System.out.println(num1);
}
String[] names = { "tom", "bob", "harry","czxdz","zc" };
for (int i = 0; i <= names.length; i++) {
    System.out.println(names[i]);
}
}}
