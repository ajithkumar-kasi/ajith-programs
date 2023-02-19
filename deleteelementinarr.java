
public class deleteelementinarr {

    public static void main(String[] args) {
        int a[]={1,2,3,4,7,9,6,87};
        int n=4;
        int b[]=new int[a.length-1];
        
        
        for(int i=0,j=0;i<a.length;i++){
            if(a[i]!=n){
            	b[j++]=a[i];
            }
      
        }
        for(int x:b)

            System.out.print(x+",");
         
    }
}

