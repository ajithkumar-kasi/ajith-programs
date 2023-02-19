import java.util.Scanner;
import java.util.Arrays;
public class deleteelementinarr {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
        int a[]={1,2,3,4,7,9,6,87};
      
        int b[]=new int[a.length-1];
        
        
        /* for(int i=0,j=0;i<a.length;i++){
            if(a[i]!=n){
            	b[j++]=a[i];
            }
      
        }*/
        for(int i=0,j=0;i<a.length;i++) {
        	
        		if(a[i]!=n) {
        			b[j++]=a[i];
        		}
        		
        }
      

            System.out.print(Arrays.toString(b));
         
        /*
        for(int i=n;i<a.length-1;i++) {
        	a[i]=a[i+1];
        	
        }
        for(int x:a)

            System.out.print(x+",");
   */ }
}

