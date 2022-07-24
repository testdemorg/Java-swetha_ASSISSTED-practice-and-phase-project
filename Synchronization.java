package assisted2;
class Send 
{ 
    public void send(String s) 
    { 
        System.out.println("Note :  \t"  + s ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + " Execute "); 
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(" For the remaining Command !!! ");
		}
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String s; 
    Send  sender; 
    ThreadedSend(String m,  Send obj) 
    { 
        s = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(s); 
        } 
    } 
} 

public class Synchronization {
	
	public static void main(String args[]) 
    { 
        Send s = new Send(); 
        ThreadedSend t1 = 
            new ThreadedSend( " syncing " , s ); 
        ThreadedSend t2 = 
            new ThreadedSend( " sync a message " ,s ); 
        t1.start();
        t2.start(); 
        try
        { 
            t1.join(); 
            t2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 

}

