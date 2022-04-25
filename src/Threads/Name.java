package Threads;


public class Name extends Thread {
	public void run() {
	 for (int i=1;i<5;i++)	{
		 System.out.print(i);
	 }
	}


	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Name n1=new Name();
		Name n2=new Name ();
		System.out.println(n1.getName());
		System.out.println(n2.getName());
		n1.setName("qwerty");
		n2.setName("bnml");
		System.out.println(n1.getName());
		System.out.println(n2.getName());


	}

}
