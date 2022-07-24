package assisted2;

public class Tryandcatch {
    public static void main(String args[]) {
    	try
    	{
    		int data = 20/0;
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println(e);
    	}
    	System.out.println("divided by zero");
    }
}
    
      

	


