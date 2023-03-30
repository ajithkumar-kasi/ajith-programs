
public class revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ajithkumar is typing...";
		/*
		char[] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}*/
		/*String d="";
		for(int i=0;i<=s.length()-1;i++) {
				d=s.charAt(i)+d;
		}
		System.out.print(d);
*/
		String[] d=s.split(" ");
		for(int i=d.length-1;i>=0;i--) {
			System.out.print(d[i]+" ");
		}
	}

}
