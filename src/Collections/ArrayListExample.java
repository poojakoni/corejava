package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] array1= {"abc","pqr","xyz","harish","pooja"};
		int [] array2 = {1,2,3};
		
	ArrayList<String> list1 =new ArrayList<String>();
	ArrayList<Integer> list2 =new ArrayList<Integer>();
	list1.add ("pooja");
	list1.add("viraaj");
	list1.add("viresh");
	list1.add("harish");
	list1.add("amma");
	
	System.out.println("list is this"+ list1);
	System.out.println("size of array list is" + list1.size());
	 list1.remove(1);//removing 1st index 
	 
	 System.out.println("list is this"+ list1);
	System.out.println("size of array list is" + list1.size());
		
		
		
		System.out.println("size of array 4th list is" + list1.get(3));//get:printing that position 
		
		list1.set(0,"kumar"); //set :replace
		
		System.out.println("size of array repliang pooja is" + list1);
		
		list1.add(1, "pooja");//add :additional element
		System.out.println("size of array after adding pooja is" + list1);
	
	Collections.sort(list1);// sort:acending order of string
	System.out.println("size of array after sort" + list1);
	
	
	for(String name:list1) { // foreach loop:using loop printing all indexs of string
		System.out.println(name);
	}

	Collections.reverse(list1);
	System.out.println("reverse sort" +list1);
	
	for(int index=0; index<list1.size(); index++) { // for loop: using loop printing all indexs of string 
			
		if(list1.get(index) == ("pooja")) {
			System.out.println("in array pooja postion is:" + index); // in string to find pooja postion 
			break;
		}
	}
	
	
	
	}
	
	}
	
	
	
	
	
	


