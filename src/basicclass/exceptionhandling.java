package basicclass;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {1,2,3,4,5};
int a=10;



try {
	int result=a/0;
	System.out.println("print" + array[8]);
	
}catch(ArrayIndexOutOfBoundsException e) {//handling excpetion using catch
System.out.println("array block");
	
}	catch(ArithmeticException e) {//handling excpetion using catch
	System.out.println("catch block");
	

	
	}finally {
		
		System.out.println("inside finally'");
	}	System.out.println("after exception");
	}

}
