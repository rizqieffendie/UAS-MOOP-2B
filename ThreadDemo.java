
public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;

	ThreadDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	public void run() {
		// TODO Auto-generated constructor stub
		try {
			for (int i = 4; i > 0 ; i--) {
				System.out.println("Thread : " +threadName + ", " + i);
			}
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread " + threadName + " interrupted.");
			System.out.println("Thread " + threadName + " exiting.");
		}
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread (this, threadName);
			t.start();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo T1 = new ThreadDemo("Thread 1");
		T1.start();
		
		ThreadDemo T2 = new ThreadDemo("Thread 2");
		T2.start();
	}

}
