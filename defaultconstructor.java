package assisted;

public class defaultconstructor {
	
			char student_name;
			int roll_no;
			
			public void display() 
			{
				System.out.println(student_name+" "+roll_no);
			}


			public static void main(String[] args) 
			{
				defaultconstructor obj1=new defaultconstructor();
				defaultconstructor obj2=new defaultconstructor();
				obj1.display();
				obj2.display();
			}
		}



