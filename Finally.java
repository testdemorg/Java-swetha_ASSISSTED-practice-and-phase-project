package assisted2;

public class Finally {


     public static void main(String[] args)
        {
            int a=20,b=1,res= 0 ;
            try
            {
               res = a / b;
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            finally
            {
                System.out.print("\n\tThe result is : " + res);
            }
        }
}

    



