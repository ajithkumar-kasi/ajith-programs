
public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="ajithkumar";
		String c="";
		char[] b=a.toCharArray();
		
		for(int i=a.length()-1;i>=0;i--) {
			c=c+b[i];
		}
		System.out.println(c);
	}

}
