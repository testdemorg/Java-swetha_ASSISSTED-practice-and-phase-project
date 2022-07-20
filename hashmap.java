package assisted;

import java.util.*;

public class hashmap {
	


			public static void main(String[] args) {
				
				
				
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(20,"swe");    
			      hm.put(25,"rose");    
			      hm.put(13,"yuva");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }

			}
	}

