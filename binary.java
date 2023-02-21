
public class binary {
	public int search(int[] a, int key) {
		int start=0;
		int end=a.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(key>a[mid]) {
				start=mid+1;
			}
			else if(key<a[mid]) {
				end=mid-1;
			}else 
				return mid;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		binary b=new binary();
		int a[]= {1,2,3,4,5,6,7,8,9,90,100};
		
		System.out.println(b.search(a,8));
		// TODO Auto-generated method stub

	}

}
