import java.lang.Math.*;
public class closettwonumbers {

	   //algorithm for finding the distance between the two closest elements in an array of numbers
	    public int MinDistance(int [] ar){
	    int [] a = ar;
	    int aSize = a.length;
	    int dMin = 0;//MaxInt
	    for(int i=0; i< aSize; i++)
	    {
	        for(int j=i+1; j< aSize;j++)
	        {   
	            dMin = Math.min(dMin, Math.abs( a[i]-a[j]));
	        }
	    }
	    return dMin;
	}

	    //MAIN
	    public static void main(String[] args){

	    	closettwonumbers at = new closettwonumbers();
	        int [] someArray = {9,1,2,3,16};
	        System.out.println("NOT-OPTIMIZED METHOD");
	        System.out.println("Array length = "+ someArray.length);
	        System.out.println("The distance between the two closest elements: " + at.MinDistance(someArray));

	    } //end MAIN

	} 
