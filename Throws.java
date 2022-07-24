package assisted2;

public class Throws {
	
	int a = 25;
	int b = 5;
	void divide()
	
	{
		if(b==5)
		{
			throw new ArithmeticException();
		}
		else
		{

			int res = a/b;
		System.out.println(res);
		}
	}
       
        
        	 public static void main(String[] args) {
        			Throw t = new Throw();
        			try {
        				t.divide();
        			}
        			catch(ArithmeticException e)
        			{
        			System.out.println(e);
        			}
        			
        		}

        	}

    





	