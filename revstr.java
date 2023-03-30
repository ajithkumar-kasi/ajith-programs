
public class revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ajithkumar is typing...";
		char[] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}
