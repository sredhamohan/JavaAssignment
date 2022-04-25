package collections;

import java.util.ArrayList;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.	Write a Java program to create a new array list, add some colors (string) and print out the collection
		
		List<String> list = new ArrayList<String>();
		
		list.add("Green");
		list.add("Black");
		list.add("Pink");
		list.add("limeGreen");
		list.add("limeGreen");//adding duplicate
		System.out.println("My Favorite Colors are " );
		for(String colors:list) {
			System.out.println(colors);
		}
		
	}

}
