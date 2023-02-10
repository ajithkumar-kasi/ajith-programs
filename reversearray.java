
public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,5,7,2,8,0,3,2,23,6,335};
		
		System.out.println("The reverse array is: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+",");
		}
	}

}
