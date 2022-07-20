package assisted;

public class method1 {


			public static void main(String[] args) {
				 int a=14;
				 int b=8;
				 int c=minFunction(a,b);
				System.out.println("Minimum Value =" + c);
			}
			
			//returns the minimum of two numbers 
			public static int minFunction(int n1, int n2) {
				int min;
				if(n1>n2)
					min = n2;
				else 
					min = n1;
				
				return min;
			}
			
		}



