package com;

public class CircularLinkedList {
	static class Node 
	{ 
		int data; 
    		Node next; 
            	Node(int d) 
    		{ 
        			data = d; 
        			next = null; 
    		} 
}
Node head; 
CircularLinkedList()   
{ 
head = null; 
} 
	void sortedInsert(Node temp) 
	{ 
    		Node current = head; 
if (current == null) 
    		{ 
        			temp.next = temp; 
        			head = temp; 
		} 
else if (current.data >= temp.data) 
    		{ 
while (current.next != head) 
            			current = current.next; 
		 	current.next = temp; 
        			temp.next = head; 
        			head = temp; 
    		} 
    		else
    		{
while (current.next != head && current.next.data < temp.data) 
            			current = current.next; 
			temp.next = current.next; 
        			current.next = temp; 
    		} 
}
void printList() 
	{ 
    		if (head != null) 
   		{ 
        			Node temp = head; 
        			do
       			{ 
            			System.out.print(temp.data + " "); 
            			temp = temp.next; 
        			}  while (temp != head); 
    		} 
	}
public static void main(String[] args) 
	{ 
    		CircularLinkedList list = new CircularLinkedList(); 
    		int arr[] = new int[] {18, 6, 9, 40, 11, 98}; 
    		Node temp = null; 
    		for (int i = 0; i < 6; i++) 
    		{ 
       			temp = new Node(arr[i]); 
        			list.sortedInsert(temp); 
    		} 
list.printList(); 
	}	
}


