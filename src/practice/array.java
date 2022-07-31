package practice;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= new int [6];

a[0]= 10; 
a[1]= 20; 
a[2]= 30; 
a[3]= 40; 
a[4]= 50; 
a[5]=60;


for(int i=0;i<a.length ;i++) {
	
	System.out.println(a[i]);
}


int n,x,falg=1,loc=0;
Scanner s= new Scanner(System.in);

System.out.println("enter no elements u want in the array");

n=s.nextInt();
int b[]= new int [n];

System.out.println("enter all the elements ");
for(int j=0; j<n;j++) {
	a[j]=s.nextInt();
	
}
System.out.println("enter  the elements u want delet ");

x=s.nextInt();
for(int j=0;j<n;j++) {
	if (a[j]==x) {
	falg=1;
	loc=j;
	break;
}
else {
	
	falg=0;
	
}
	if (falg==1) {
		for (int j1=loc+1;j1<n;j1++) {
			a[j1-1]=a[j1];		}
	
	
	System.out.println("after deleting");
	for(int j1=0; j1<n-2;j1++) {
		System.out.println(a[j]+",");
		
		
	}}
	else {
	System.out.println("elementt not found");
}
	
}}}
