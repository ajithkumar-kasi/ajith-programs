package mypack1;

public class nonrepeatingcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s="hashmaps";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]&&c[i]!=' ') {
					System.out.println(c[i]);
				}
			}
			
		}
		
	}

}
