package collections;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		String[] array1= {"abc","xyz","pqr"}; //array sepecify the elements
		
		ArrayList<String> list =new ArrayList<String>();//declaring arraylist .unlimited element we can create in arraylist
		list.add("pooja");
		list.add("viraj");
		list.add("harish");
		list.add("amma");
		list.add("amruta");
		list.add("krishna");
		
		System.out.println("print array list "+ list); //covert into string 
		System.out.println("print array list "+ list.size());
		
		list.set(0,"kamal");//add element in first position
		System.out.println("print findarray list "+ list); 
		
		
		Collections.sort(list);//acensing order alphbetic sorting arraylist
		System.out.println("print sortarray list "+ list);
		
		
		Collections.reverse(list);//decensing order ayyalist alphbetic 
		System.out.println("print reverse array list "+ list);
		
		
		
		for (int j=0;j<list.size();j++) {
			
		//	System.out.println("all string print:  "+ list.get(j));
			
			if(list.get(j).equals("viraj")) {
				System.out.println("find index no of viraj:"+ j);
				break;
				
			}
			
		//___________________________________________________________________________________________
		
		ArrayList<Integer> int1 = new ArrayList<Integer>();//in integer value
	  int1.add(100);
	  int1.add(200);
	  int1.add(300);
	  int1.add(500);
	  
		System.out.println("print array list "+ int1); 
		System.out.println("print array list "+ int1.size()); 
		
		int1.remove(3);//removed from index 3rd.
		System.out.println("print array list "+ int1); 
		
		int1.add(400);//add element
		System.out.println("print array list "+ int1); 
		
		
		System.out.println("print findarray list "+ int1.get(2)); //to find element in arraylist
		
		for(int i=0;i<int1.size();i++) {
			System.out.println("print get list "+ int1.get(i)); 
			
			if(int1.get(i)==300) {
				
				System.out.println("print 300 idex in list "+ i); 	
			}
						
		}//OR
		/*for(int i:int1) {
			
			System.out.println("print get list "+ i); 
		}*/
		
		
		}

}
}