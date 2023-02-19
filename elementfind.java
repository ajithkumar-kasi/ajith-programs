import java.util.Scanner;
public class elementfind {
private static boolean contain(int n,int a[]) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				return true;
			}
			
			 
		 }
		return false;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[]={1,2,3,4,5,7,9,9,0,7,6,5,4,3,535,46,6,87,87};
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 if(contain(n,a)) {
			 System.out.println("the array contains given number ");
		 }else
			 System.out.println("the array not contains the given number ");
		 
		
	}

	
}