
public class missingnumberinsequense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {11,12,13,14,15,16,18,19,20};
		int sum=0;
		int n=a.length;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		int total=((n+2)*(n+1))/2;
		int num=total-sum;
		System.out.println(num);
	}
}
