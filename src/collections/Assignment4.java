package collections;

import java.util.LinkedList;
import java.util.List;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(" a Java program to insert the specified element at the specified position in the linked list.");
	
		List<String> list = new LinkedList<String>();
		list.add("Euro");
		list.add("Rupees");
		list.add("Dollar");
		list.add("SEK");
		
		System.out.println("Before elements");
		for(String currency:list) {
			System.out.println(currency);
		}
		
		System.out.println("After elements");
		
		list.set(1, "INR");
		
		for(String currency:list) {
			System.out.println(currency);
		}
		
	}

}
