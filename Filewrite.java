package assisted2;

	import java.io.FileWriter;
	//import java.util.*;

	public class Filewrite {
		
			public static void main(String args[]) {
				String data= "101,yuv, 1231.";
			
			
			try {
			FileWriter output= new FileWriter("E:\\Data.txt");
			output.write(data);
			System.out.println("writes file");
			output.close();
			}
			catch(Exception e)
			{
				System.out.println("Error File: "+ e);
			}
		}
		
	}


