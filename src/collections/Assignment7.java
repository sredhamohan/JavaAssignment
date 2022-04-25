package collections;

import java.util.HashMap;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(" a Java program to count the number of key-value (size) mappings in a map.");
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Kiwi");
		System.out.println(map.size());
	}

}
