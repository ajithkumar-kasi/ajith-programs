
public class swapelementsarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		
		for(int j=0;j<3;j++) {
			int n=a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
				
				}
			a[a.length-1]=n;
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
			
		}
		
		
	

}
