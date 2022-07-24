package assisted2;

public class Throw {
	
	int a = 20;
	int b =4;
	void divide()
	{
		if(b==4)
		{
			throw new ArithmeticException("can divuide by 4");
		}
		else {
			int res =a/b;
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
