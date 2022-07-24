package assisted2;

	import java.io.File;
	import java.io.IOException;

	public class Filecreate {

		public static void main(String[] args) {
			
			File myfile=new File("E:\\Data.txt");
			try {
				if(myfile.createNewFile())
				{
					System.out.println("create file");
				}
				else {
					System.out.println("File is not  Created");
				}
			} catch (IOException e) {
				
				System.out.println("File is not  Created");
			}
			
			
		}
	}

