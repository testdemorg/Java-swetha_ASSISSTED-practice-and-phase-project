package assisted;

public class localinnerclass {
	
		
		void test()
		{
			class inner{
				void all() {
					System.out.println(" create java");
				}
			}
			inner ob=new inner();
			ob.all();

		}

		public static void main(String[] args)
		{
			localinnerclass obj=new localinnerclass();
			obj.test();
		}
	}


