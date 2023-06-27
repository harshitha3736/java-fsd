package Phase1_assessment2;

public class PP2_SleepAndWait {

	public static void main(String[] args)throws InterruptedException {
		 
        // Sleep demo
        System.out.println("Sleep demo started");
        Thread.sleep(10000); // Sleep for 10 seconds
        System.out.println("Sleep demo ended");
        
        // Wait demo
        System.out.println("Wait demo started");
        Object lock = new Object();
        synchronized(lock) {
            lock.wait(10000); // Wait for 10 seconds
        }
        System.out.println("Wait demo ended");

	}

}

