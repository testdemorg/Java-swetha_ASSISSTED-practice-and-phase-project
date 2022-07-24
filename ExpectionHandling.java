package assisted2;
class Exceptionhandling extends Exception
{
	   String str1;
	   Exceptionhandling(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("Exceptionhandling Occurred: "+str1) ;
	   }
	}

public class ExpectionHandling {
	public static void main(String args[]){
		try{
			System.out.println("Start  a message");
			throw new Exceptionhandling("error");
		}
		catch(Exceptionhandling exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }


}


