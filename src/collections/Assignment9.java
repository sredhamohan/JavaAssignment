package collections;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//9.	Write a program to reverse a string in Java without using the reverse method.
		
		System.out.println("Enter the string to be reversed");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Reversed string is ");
		for(int i=str.length();i>0;i--)
		{
			System.out.print(str.charAt(i-1));
		}
	}

}
