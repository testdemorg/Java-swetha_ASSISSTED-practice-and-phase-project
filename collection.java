package assisted;

import java.util.*;


public class collection {



		public static void main(String[] args) {
			//creating arraylist
			System.out.println("ArrayList");
			ArrayList<String> chocolates=new ArrayList<String>();   
		      chocolates.add("snickers");//
		      chocolates.add("kitkat");    	   
		      System.out.println(chocolates);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(17); 
		      vec.addElement(38); 
		      System.out.println(vec);
			
			//creating linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("yuva");  
		      names.add("maha");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(105);  
		       set.add(178);  
		       set.add(100);
		       set.add(104);
		       System.out.println(set);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(11);  
		       set2.add(17);  
		       set2.add(45);
		       set2.add(10);	       
		       System.out.println(set2);
		      	} 
		      }  
		}


