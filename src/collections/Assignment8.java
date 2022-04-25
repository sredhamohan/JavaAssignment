package collections;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Write a Java program to concatenate a given string to the end of another string.
		String str1,str2,concat;
		System.out.println("Enter String 1");
		Scanner sc= new Scanner(System.in);
		str1=sc.nextLine();
		System.out.println("Enter String 2");
		str2=sc.nextLine();
		
		
		concat=str1.concat(str2);
		System.out.println("Concataneted string is "+ concat);
		
	}

}
