package oops;

class Teacher {
	
	String designation="HOD";
	String subject="Control Systems";
}
 class Info extends Teacher{
	
	String collage="MCET";
	int Age=54;
	int  exp=15;
	String name="Sredha";
	
	
	
}


public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Info tInfo=new Info();
System.out.println(tInfo.name);
System.out.println(tInfo.designation);
System.out.println(tInfo.subject);
System.out.println(tInfo.exp);
System.out.println(tInfo.collage);


	}

}
