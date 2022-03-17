package threads;

public class MyRunnableThreads implements Runnable {
	public  static int mycount = 0;
	public MyRunnableThreads() {
		
	}
	public void run() {
		while(MyRunnableThreads.mycount <= 10) {
			try {
				System.out.println("Expl Thread: "+(++MyRunnableThreads.mycount));
				Thread.sleep(100);
				}catch (InterruptedException iex) {
					System.out.println("Exceptionin thread:"+iex.getMessage());
					}
		}
		
	}
	public static void main(String a[]) {
		System.out.println("Starting Main Thread...");
		MyRunnableThreads mrt = new MyRunnableThreads();
		Thread t = new Thread(mrt);
		t.start();
		while(MyRunnableThreads.mycount <= 10) {
			try {
				System.out.println("Main Thread: "+(++MyRunnableThreads.mycount));
				Thread.sleep(100);
				}catch (InterruptedException iex) {
					System.out.println("Exception in main thread: "+iex.getMessage());
					
				}
		}
		System.out.println("End of Main Thread...");
		
	}

}
