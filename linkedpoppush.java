
	import java.util.*;  
	
	   
public class linkedpoppush {
 /* Driver Code */  
	    public static void main(String ar[])  
	    {  
	        /* Implementing LinkedList using a stack representation. */  
	        LinkedList<String> listStack = new LinkedList<>();  
	        /* Adding an element into stack. */  
	        listStack.push("List");  
	        listStack.push("Linked");  
	        listStack.push("Implementating");  
	        System.out.println("Linked List after adding new elements: " + listStack);  
	        /* Deleting an element from stack. */  
	        System.out.println("Deleted element 1: " + listStack.pop());  
	        /* Adding an element into stack. */  
	        listStack.push("Stack");  
	        /* Displaying the complete stack. */  
	        System.out.println("New Linked List: " + listStack);  
	    }  
	}  