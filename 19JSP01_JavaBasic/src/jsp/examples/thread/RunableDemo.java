/**
 * 
 */
package jsp.examples.thread;

/**
 * @author TechCare
 *
 */
public class RunableDemo implements Runnable {
	private Thread t;
	private String threadName;
	
	RunableDemo(String name) {
		this.threadName = name;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4 ; i > 0 ; i-- ) {
				System.out.println("Thread : " + threadName + ", " + i);
				// Let sleep sleep for a while
				Thread.sleep(5000);
			}
			
		} catch (InterruptedException e) {
			System.out.println("Thread : " + threadName + " interruped ");
		}
		System.out.println("Thread : " + threadName + " exiting ");
	}
	
	public void start() {
		System.out.println("Starting : " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	public static void main (String args[]) {
		RunableDemo demo = new RunableDemo("thread JSP");
		demo.start();
//		demo.run();
	}
	
}
