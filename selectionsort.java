import java.util.Arrays;
public class selectionsort {

	public static void main(String[] args) {
		int a[]= {10,23,12,43,5,18,5,676,43,5};
		
		System.out.println("The given array is:- ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println(" ");
		System.out.println("The Selection sor using  array is:-");
		
		
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		
		
		
		
		
		
		for(int x:a) {
			System.out.print(x+" ");
		}
		
	}

}
