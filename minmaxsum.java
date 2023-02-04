import java.util.*;
public class minmaxsum {
	// Java Implementation of the above approach
	/*	static void minMax(int[] arr)
		{
			// Initialize the min_value
			// and max_value to 0
			int min = 0;
			int max = 0;
			// Sort array before calculating
			// min and max value
			Arrays.sort(arr);
			for (int i = 0; i<arr.length-1;i++)
			{
				min=min+arr[i];
			}
			for(int j=arr.length-1;j>0;j--) {
				max=max+arr[j];
			}
			
			
			
			// Output: min_value and max_value
			System.out.println(
				"min value: "+min + " "+ "Max value: "+max
				);
		}

		// Driver Code
		public static void main(String[] args)
		{
			// Initialize your array elements here
			int[] arr = { 10, 9, 8, 7, 6, 5 };
			int[] arr1 = { 100, 200, 300, 400, 500 };
			minMax(arr);
			minMax(arr1);
		
		}
		*/

	    public static void main(String[] args) {
	      int a[]={1,2,3,4,5,6,7};
	      int maxsum=0;
	      int minsum=0;
	      
	      for(int i=0;i<a.length-1;i++)
	      {
	          minsum +=a[i];
	      }
	        System.out.println(minsum);
	        System.out.println(" ");
	    
	      for(int i=a.length-1;i>0;i--)
	      {
	          maxsum +=a[i];
	      }
	        System.out.println(maxsum);
	    
	    }
	}
	

