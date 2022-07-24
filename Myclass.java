package assisted2;

public class Myclass {
	 private static Object LOCK = new Object();
	    
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(1000);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after  10 hrs");
	        synchronized (LOCK) 
	    
	        {
	            LOCK.wait(1000);
	            System.out.println("Object '" + LOCK + "' is woken after" + " is waiting for 10 mins");
	        
	        }    
	        
	        }
}


