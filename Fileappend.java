package assisted2;

	import java.io.FileWriter;
	import java.io.IOException;

	public class Fileappend {

		public static void main(String[] args) {
			String data="The new Text is appended to the following .txt folder";
			
			try {
				FileWriter output=new FileWriter("E:\\data.txt",true);
				output.write(data);
				System.out.println(" Appended Successfully.");
				output.close();
			} catch (IOException e) {
				System.out.println(" Append Failed");
			}

		}
	}


