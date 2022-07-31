package practice;

public class student {
int rollno;
String name;
static String college = "mgt";
static void change () {
	
	college = "MGIT";
	
}
student (int r, String n){
	rollno =r;
	name =n;
}void display(){
	System.out.println(rollno + "" + name + "" +college );
}
}
