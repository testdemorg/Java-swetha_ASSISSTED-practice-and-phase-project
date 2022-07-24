package assisted2;
interface first 
{  
    default void show() 
    { 
        System.out.println(" First"); 
    } 
} 
interface second
{  
    default void show() 
    { 
        System.out.println(" Second"); 
    } 
}  

public class Diamond implements first,second {
	public void show() 
    {  
        first.super.show(); 
        second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Diamond ob = new Diamond(); 
        ob.show(); 
    } 
}




