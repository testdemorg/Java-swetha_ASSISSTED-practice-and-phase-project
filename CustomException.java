package assisted2;

class MyCustomException extends Exception 
{ 
    public MyCustomException(String s) 
    { 
        super(s); 
    } 
} 

public class CustomException {
	public static void main(String args[]) 
    { 
        try
        { 
            throw new MyCustomException("written easily"); 
        } 
        catch (MyCustomException ex) 
        { 
            System.out.println("Caught exception"); 
            System.out.println(ex.getMessage()); 
        } 
    } 


}


