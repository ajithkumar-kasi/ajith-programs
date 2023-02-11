import java.util.ArrayDeque;    
	import java.util.Deque;    
	    
	
public class dequepop {
	   
	  /* Driver Code */  
	  public static void main(String[] args)   
	  {    
	    Deque<Integer> dq = new ArrayDeque<Integer>();    
	    /* Inserting the elements. */    
	    dq.push(1);    
	    dq.push(2);    
	    dq.push(3);   
	      
	    /* Displaying the deque. */  
	  
	    System.out.println("Deque after insertion: ");  
	    for (Integer integer : dq)   
	    {    
	        System.out.println(integer);    
	    }    
	      
	    /* Deleting the element.  */  
	    dq.pop();   
	      
	    /* Displaying the complete deque. */  
	  
	    System.out.println("After deletion: " );    
	    for (Integer integer : dq)   
	    {    
	        System.out.println(integer);    
	    }    
	  
	     
	  }    
	}    

