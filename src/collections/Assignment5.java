package collections;



import java.util.HashSet;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//5.	Write a Java program to iterate through all elements in a hash list.
		Set<String> list = new HashSet();
		list.add("Mango"); 
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes"); 
		System.out.println("Iterating Hashlist...");
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		
	    System.out.println(list);
		 
	   
		}
	}


