/**
 * 
 */
package jsp.examples.thread;

/**
 * @author ndloc
 *
 */
public class CounterThread implements Runnable {
	int count = 0;
	String threadName;
	int sleep = 0;
	
	

	public CounterThread(String threadName, int sleep) {
		super();
		this.threadName = threadName;
		this.sleep = sleep;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			count += 100;
			System.out.println(threadName + ": counter" + count);
			sleepThread(this.sleep);
			if (count >= 1000) {
				Thread.currentThread().isInterrupted();
				break;
			}
			
		}
	}
	
	public void sleepThread(int milisec) {
		try {
			Thread.sleep(milisec);
		} catch (InterruptedException e) {
			
		}
	}
	
	public static void main (String args[]) {
		CounterThread counterThread = new CounterThread("CounterThread", 2000);
		counterThread.run();
	}
	
}
