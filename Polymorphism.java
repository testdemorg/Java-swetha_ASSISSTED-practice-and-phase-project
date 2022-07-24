package assisted2;

public class Polymorphism {
	public int sum(int a, int b) 
    { 
        return (a + b); 
    } 
    public double sum(double a, double b, double c) 
    { 
        return (a + b + c); 
    } 
    public double sum(float a, float b) 
    { 
        return (a + b); 
    } 
    public static void main(String args[]) 
    { 
        Polymorphism s = new Polymorphism(); 
		System.out.println(s.sum(11, 20)); 
        System.out.println(s.sum(11.5, 28, 30)); 
        System.out.println(s.sum(12.5f, 24.5f)); 
    } 


}


