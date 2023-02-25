package mypack1;

public class countinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		String s="ajithkumar ";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ')
			count++;
			
		}
		System.out.println(count);
		
	}

}
