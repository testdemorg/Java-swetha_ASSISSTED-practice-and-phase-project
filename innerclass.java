package assisted;

public class innerclass {

	
		

	    private String name="welcome";
			
			class inner{
				void welcome() {
					System.out.println(" Hi All!");
				}
			}

			public static void main(String[] args) {
		        innerclass obj=new innerclass();
				innerclass.inner innerobj=obj.new inner();
				innerobj.welcome();
		     

			}

		}
		

