package com;
import java.util.*;
public class QueueProgram {
	
		public static void main(String[] args) 
		{
		        		Queue<String> NameQueue = new LinkedList<>();
		                NameQueue.add("swe");
		        		NameQueue.add("yuva");
		        		NameQueue.add("bru");
		        		NameQueue.add("sas");
		        		NameQueue.add("Pune");
		System.out.println("Queue is : " + NameQueue);
		        		System.out.println("Head of Queue : " + NameQueue.peek());
		        		NameQueue.remove();
		        		System.out.println("After removing Head of Queue : " + NameQueue);
		        		System.out.println("Size of Queue : " + NameQueue.size());
		    	}
	}


