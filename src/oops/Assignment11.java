package oops;
/*11.	 Constructor: Create one simple and one parametrized constructor for user information (Age, name).
Call both the constructor from Main method and print the user information.*/
public class Assignment11 {
	String name;
	int age;
	
	Assignment11(){	
		name="Aaren";
		age=5;
		
	}
	Assignment11(String perName,int perAge){		
		name=perName;
		age=perAge;
	}
	
	void print() {
		System.out.println(name + " "+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assignment11 perInfo= new Assignment11();
Assignment11 perInfo2= new Assignment11("Rishith",2);

perInfo2.print();
perInfo.print();

	}

}
