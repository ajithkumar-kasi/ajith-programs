import java.util.*;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {18,32,5,34,6,86};
		Arrays.sort(a);
	
		System.out.println("Ascending order:");
		for(int x:a) {
			System.out.print(x+",");
		}
		System.out.println(" ");
		System.out.println(Arrays.toString(a));
		
		System.out.print("descending order:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+",");
		}
		
	}

}
