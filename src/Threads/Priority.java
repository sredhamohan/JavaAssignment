package Threads;




public class Priority extends Thread {

	public void run() {
		 for (int i=1;i<5;i++)	{
			 System.out.print(i);
		 }
		}


		public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Priority p1=new Priority();
			Priority  p2=new Priority();
			System.out.println(p1.getPriority());
			System.out.println(p2.getPriority());
			p1.setPriority(3);
			p2.setPriority(6);
			System.out.println(p1.getPriority());
			System.out.println(p2.getPriority());


		}

	}
