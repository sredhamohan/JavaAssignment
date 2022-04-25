package Threads;

public class Alive extends Thread {
	public void run() {
		 for (int i=1;i<5;i++)	{
			 System.out.println(i);
		 }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alive th1=new Alive();

System.out.println(th1.isAlive());

th1.start();

System.out.println(th1.isAlive());

	}

}
