package threads;

public class Threads extends Thread {
	public void run() 
	{
		System.out.println("concurrent thread started runnig..");
		
	}
	public static void main(String[] args)
	{
		
	Thread mt = new Threads();
	mt.start();
}
}
