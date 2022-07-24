package assisted2;

	class car 
	{ 
	    
	    public int speed; 
	    public void Motorcycle(int speed) 
	    { 
	       
	        this.speed = speed; 
	    } 
	    public void applyBrake(int decrement) 
	    { 
	        speed -= decrement; 
	    } 
	    public void speedUp(int increment) 
	    { 
	        speed += increment; 
	    }  
	    public String toString()  
	    { 
	        return( "speed of car is " + speed); 
	    }  
	} 
	class volvo extends car
	{ 
	    public int seatHeight; 
	    public volvo(int speed,int startHeight) 
	    {  
	        super(); 
	        seatHeight = startHeight; 
	    }  
	    public void setHeight(int newValue) 
	    { 
	        seatHeight = newValue; 
	    } 
	    public String toString() 
	    { 
	        return (super.toString()+ 
	                "\nseat height is "+seatHeight); 
	    } 
	}
	public class Inheritance {
		public static void main(String args[])  
	    { 
	        volvo mb = new volvo(120, 200); 
	        System.out.println(mb.toString());
	    } 

	}


