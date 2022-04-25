package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3.	Write a Java program to iterate through all elements in a linked list starting at the specified position.
		
		List<String> list = new LinkedList<String>();
		list.add("Euro");
		list.add("Rupees");
		list.add("Dollar");
		list.add("SEK");
		
		for (int i=1;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	/*	
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
	}

}
