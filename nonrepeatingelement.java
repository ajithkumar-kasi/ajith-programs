
public class nonrepeatingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,1,3,4,6,8,2,3};
		int n=a.length;
		int flag=0;
		int visited=-1;
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!=visited) {
				b[i]=count;
			}
		}
		for(int i=0;i<n;i++) {
			if(b[i]==0) {
				System.out.println(a[i]  );
			}
		}
		
	}

}
