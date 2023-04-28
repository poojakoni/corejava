package basicclass;

public class vowelcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="clean world gree world";
int count=0;

for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i); //sperate string to latter
//System.out.println(ch);

//if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u') {
	
//	count++;
//}


//}
//System.out.println("vowels are" + count);

	
	//OR
switch(ch) {
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
count++;
break;
}
}System.out.println(count);
	}

}
