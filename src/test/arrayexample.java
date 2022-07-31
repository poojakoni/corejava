package test;

public class arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {1,2,3,4,5,6};

		System.out.println("total no of array :" + array1.length);
		System.out.println("The first num is " + array1[0]);
		System.out.println("The last num is " + array1[array1.length -1]);
		
		String [] array2 = {"pooja","viraj","harish","viresh"};
		System.out.println("total no of array" +array2.length);
		
		String str3 = "Clean World Green World";
		
		String[] array3 = str3.split(" ");
		System.out.println("The first word is " + array3[3]);
		
		
	}

}
