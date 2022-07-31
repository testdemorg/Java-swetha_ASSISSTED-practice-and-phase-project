package virtual;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class VirtualKeyRepo {


	Scanner sc = new Scanner(System.in);
	 public static void printBox(Scanner input, int length) {
	 int top = 0;
	 System.out.print("+");
	 while (top < length + 2) {
	 System.out.print("-");
	 top++;
	 }
	 System.out.print("+");
	 System.out.println();
	 while (input.hasNextLine()) {
	 String line = input.nextLine();
	 System.out.print(" |" + line);
	 int i = length - line.length();
	 for (int j = 0; j <= i; j++) {
	 System.out.print(" ");
	 }
	 System.out.println("|");
	 }
	 System.out.print("+");
	 int bottom = 0;
	 while (bottom < length + 2) {
	 System.out.print("-");
	 bottom++;
	 }
	 System.out.print("+");
	 }
	 
	 public static void main(String args[]) {
	 Scanner s = new Scanner(System.in);
	 String title = "Welcome to Virtual Repository \n";
	 Scanner head = new Scanner(title);
	 VirtualKeyRepo mc = new VirtualKeyRepo();
	 mc.printBox(head, title.length());
	 System.out.println();
	 while (true) {
	 String title1 = "Main Menu";
	 Scanner head1 = new Scanner(title1);
	 mc.printBox(head1, title1.length());
	 System.out.println("\n1.Retrieving the file name in an ascending order\n2.Bussiness level operations\n3.close the application\n4.Enter 0 to close the application");
	 System.out.println("Enter your choice");
	 int num = s.nextInt();
	 switch (num) {
	 case 0:
	 System.out.println("Quitting...");
	 System.exit(1);
	 break;
	 case 1:
	 Operations.listFiles();
	 break;
	 case 2:
	 System.out.println("");
	 String title2 = "Operations";
	 Scanner head2 = new Scanner(title2);
	 mc.printBox(head2, title2.length());
	 System.out.println("Please choose one of the following options :");
	 System.out.println("1. Add a File");
	 System.out.println("2. Delete a File");
	 System.out.println("3. perform file operation");
	 System.out.println("4. Goback Main Menu");
	 int choice = s.nextInt();
	 switch (choice) {
	 case 1:
	 Operations.createFile();
	 break;
	 case 2:
	 Operations.deleteFile();
	 break;
	 case 3:
	 Operations.searchFile();
	 break;
	 default:
	 System.out.println("\n Opps! Invalid Input,Re-do the process\n");
	 break;
	 }
	 break;
	 case 3:
	 s.close();
	 System.out.println("\n Thanks for using my application...");
	 System.exit(1);
	 break;
	 default:
	 System.out.println("\n\n Wrong Input\n");
	 break;
	 }
	 }
	 }
	}
	class Operations {
	 static Scanner s = new Scanner(System.in);
	 public static void createFile() {
	 System.out.println("Enter file name to create");
	 String file_name = s.next();
	 File file = new File((System.getProperty("user.dir")) + "\\" + file_name);
	 try {
	 if (file.createNewFile()) {
	 System.out.println("File Created successfully");
	 } else {
	 System.out.println("File name already exists !!....");
	 }
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	 }
	 public static void deleteFile() {
	 System.out.println("Enter file name to delete");
	 String file_name = s.next();
	 File file = new File((System.getProperty("user.dir")) + "\\" + file_name);
	 if (file.exists()) {
	 if (file.delete()) {
	 System.out.println("File deleted successfully!");
	 }
	 } else {
	 System.out.println("(File Not Found)");
	 }
	 }
	 public static void searchFile() {
	 System.out.println("Enter file name you are searching for");
	 String file_name = s.next();
	 File file = new File((System.getProperty("user.dir")) + "\\" + file_name);
	 if (file.exists()) {
	 System.out.println(" File found ");
	 } else {
	 System.out.println(" Couldn't found");
	 }
	 PrintWriter pw;
	 try {
	 pw = new PrintWriter(file_name);
	 pw.println("saved");
	 } catch (FileNotFoundException e) {
	 System.out.println(e);
	 }
	 }
	 public static String[] sort_sub(String array[], int size) {
	 String temp = "";
	 for (int i = 0; i < size; i++) {
	 int j = 1;
	 while(j>0 && (array[j-1].compareToIgnoreCase(array[j]) > 0)) {
	 temp = array[j-1];
	 array[j-1] = array[j];
	 array[j] = temp;
	 
	 }
	 }
	 return array;
	 }
	 public static void listFiles() {
	 int fileCount = 0;String list_Prompt = "Listing files.... ";
	 ArrayList<String> filenames = new ArrayList<String>();
	 File directoryPath = new File(System.getProperty("user.dir"));
	 File[] listOfFiles = directoryPath.listFiles();
	 fileCount = listOfFiles.length;
	 System.out.println("");
	 VirtualKeyRepo.printBox(new Scanner(list_Prompt), list_Prompt.length());
	 System.out.println("");
	 for (int i = 0; i < fileCount; i++) {
	 if (listOfFiles[i].isFile()) {
	 filenames.add(listOfFiles[i].getName());
	 }
	 }
	 String[] str = new String[filenames.size()];
	 for (int i = 0; i < filenames.size(); i++) {
	 str[i] = filenames.get(i);
	 }
	 String[] sorted_filenames = sort_sub(str, str.length);
	 Arrays.sort(str);
	 for (int i=0; i<sorted_filenames.length; i++) {
	 System.out.println((i+1)+". "+sorted_filenames[i]);
	 }
	}
	 } 
	