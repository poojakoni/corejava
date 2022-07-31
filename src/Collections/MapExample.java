package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		
		map1.put(1,"pooja");
		map1.put(2, "viraaj");
		map1.put(3, "viresh");
		map1.put(4, "harish");
		map1.put(5, "amma");
		map1.put(100, "key");
		
		
	System.out.println(map1);
	
	System.out.println("data at 4th key is:"+ map1.get(4));
	System.out.println("data at 100 key is:"+ map1.get(100));
	
	map1.remove(100);
	System.out.println(map1);
	
	for (Integer key: map1.keySet() ) {
		
		System.out.println("Key is : " +  key);// it will print key 
		System.out.println("Value is : " + map1.get(key));// print keyvalue
	
	}
	
	}
	
	
	

}
