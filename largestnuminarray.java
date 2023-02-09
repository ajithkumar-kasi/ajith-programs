import java.util.Arrays;

public class largestnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,34,5,678,3,21,78,23,3};
		
		/*Arrays.sort(a);
		for(int x:a) {
			System.out.print(x+",");
		}
		System.out.println("");
		System.out.println("The lergest number is:"+a[a.length-1]);
		System.out.println("The smallest number is:"+a[0]);
		*/
		int small=a[0],large=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
				
			}
			else if(a[i]<small)
				small=a[i];
		}
		System.out.println(large);
		System.out.println(small);
	}

}
