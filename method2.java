package assisted;

import java.util.Scanner;


	public class method2 {
		

			final double pi=3.14;
			
			public float areaOfCircle(int r)
			{
				float A=(float) (pi*(r*r));
				return A;
			}
			public static void main(String[] args) 
			{
				System.out.println("Enter the value of radius:");
				Scanner sc=new Scanner(System.in);
				int r=sc.nextInt();
				method2 obj=new method2();
				float c=obj.areaOfCircle(r);
				System.out.println("Area Of Circle is:"+c);
				
			}

		}



