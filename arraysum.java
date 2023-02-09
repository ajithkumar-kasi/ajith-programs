
public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={2,4,3,5,7,8,9};
		int sum=7;
		System.out.println("The pairs are:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}

}
