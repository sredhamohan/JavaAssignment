package Threads;

class SleepThread extends Thread{
	
	public void run() {
		for(int i=0;i<=5;i++) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
		}
	}
	
}

public class Sleep {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		SleepThread sleep=new SleepThread();
		sleep.start();

	}

}
