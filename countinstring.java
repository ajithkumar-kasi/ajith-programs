
public class countinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="I am ajith kumar";
		int count=0;
		char[] s=a.toCharArray();
		/*for(int i=0;i<s.length;i++) {
			count++;
		}
		System.out.println(count);
	*/
		for(int i=0;i<s.length;i++) {
			
			if(s[i]=='a')
			count++;
		}
		System.out.println(" 'a' arrived  is arrvied "+count+" time ");
	
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]);
		}
	}

}
