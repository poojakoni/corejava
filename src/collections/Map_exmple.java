package collections;

import java.util.HashMap;

public class Map_exmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hash = new HashMap<Integer, String>();

		hash.put(1, "pooja");
		hash.put(2, "viresh");
		hash.put(3, "harish");
		hash.put(4, "viraj");
		hash.put(5, "krishna");
		hash.put(6, "come");
		hash.put(1000, "kamal");

		System.out.println("print the map " + hash);

		System.out.println("4th postion " + hash.get(4));
		System.out.println("1000th postion " + hash.get(1000));

		hash.remove(1000);
		System.out.println("print the map " + hash);
		
		hash.replace(6,"amar");
		System.out.println("print the map " + hash);
		
		
		for(Integer key:hash.keySet()) {
			System.out.println("key is " + key);
			System.out.println("value is :" + hash.get(key));
			
		}
		

	}

}
