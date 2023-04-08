import java.util.ArrayList;
import java.util.*;	
public class duplicateelement {
	/*public static int removeduplicates(int a[], int n)
		{
			if (n == 0 || n == 1) {
				return n;
			}

			// creating another array for only storing
			// the unique elements
			int[] temp = new int[n];
			int j = 0;
			for (int i = 0; i < n - 1; i++) {
				if (a[i] != a[i + 1]) {
					temp[j++] = a[i];
				}
			}
			temp[j++] = a[n - 1];
			
			// Changing the original array
			
			for (int i = 0; i < j; i++) {
				a[i] = temp[i];
			}
			return j;
		}*/
	
	
	
	
	
	
	/*
		public static void main(String[] args)
		{
			int a[] = { 1, 1, 2,4,5,7,8,5,2,2,2 };
			int n = a.length;

			/*n = removeduplicates(a, n);

			// Printing The array elements
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
		
	
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) 
						System.out.println(a[j]);
				}
			}
		}
		
		*/ 
		    /* public static void main(String[] args) {      
		          
		        //Initialize array   
		        int [] arr = new int [] {1, 2,2, 3, 4, 2, 7, 8, 8, 3};   
		          
		        System.out.println("Duplicate elements in given array: ");  
		        //Searches for duplicate element  
		        for(int i = 0; i < arr.length; i++) {  
		            for(int j = i + 1; j < arr.length; j++) {  
		                if(arr[i] == arr[j])  
		                    System.out.println(arr[j]);  
		            }  
		        }  
		    }  */
	
	
	
	 /*
	
	
	static void findDuplicates(int arr[], int len)
	    {
	 
	        // initialize ifPresent as false
	        boolean ifPresent = false;
	 
	        
	        // ArrayList to store the output
	        ArrayList<Integer> al = new ArrayList<Integer>();
	 
	        for (int i = 0; i < len ; i++) {
	            for (int j = i + 1; j < len; j++) {
	                if (arr[i] == arr[j]) {
	                    // checking if element is
	                    // present in the ArrayList
	                    // or not if present then break
	                    if (al.contains(arr[i])) {
	                        break;
	                    }
	 
	                    // if element is not present in the
	                    // ArrayList then add it to ArrayList
	                    // and make ifPresent at true
	                    else {
	                        al.add(arr[i]);
	                        ifPresent = true;
	                    }
	                }
	            }
	        }
	 
	        // if duplicates is present
	        // then print ArrayList
	        if (ifPresent == true) {
	 
	            System.out.print(al + " ");
	        }
	        else {
	            System.out.print("No duplicates present in arrays");
	        }
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
	 
	        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
	        int n = arr.length;
	 
	        findDuplicates(arr, n);
	    }
	
		}  
	*/
	

	 public static void main(String[] args)
	    {
	 
	      int arr[] = {12, 11, 40, 12, 5, 6, 5, 12, 11};
	     /* List<Integer> a=new ArrayList<Integer>();
	      a.addAll(Arrays.asList(arr));    
	      Set<Integer> dup=new HashSet<Integer>(a);
	      List<Integer> b=new ArrayList<Integer>(dup);
	      System.out.println(b);
	     */
	      int b[]=new int[10];
	      int index=0;
	      for(int i=0;i<arr.length;i++){
	    	  int flag=0;
	    	  for(int j=0;j<i;j++) {
	    		  if(arr[i]==arr[j]) {
	    			  flag=1;
	    			  break;
	    		  }
	    	  }
	    	  if(flag==0) {
	    		  b[index]=arr[i];
	    		  index++;
	    		  
	    	  }
	      }
	      for(int k=0;k<index;k++){
	    	  System.out.println(b[k]);
	    	  
	      }
	      
	          
     }	 
}
	
	
	
	
	
	
	
	

