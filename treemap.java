package assisted;

import java.util.*;


public class treemap {

	
		public static void main(String args[]) {
		
	    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(68,"papa");    
	    map.put(19,"Caroline");    
	    map.put(77,"sasmi");       
	    
	    System.out.println("\nThe elements of TreeMap are ");  
	    for(Map.Entry l:map.entrySet()){    
	     System.out.println(l.getKey()+" "+l.getValue());    
	    }    
	    
	 }  
	}


