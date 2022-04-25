package collections;

import java.util.HashSet;
import java.util.Set;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6.	Write a Java program to get the number of elements in a hash set.
		
		Set<String> list = new HashSet();
		list.add("Mango"); 
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes"); 
		System.out.println("Number of elements is a hashset is " +list.size());
	}

}
