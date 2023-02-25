package mypack1;

public class nonrepeatingcharinstring {

	public static void main(String[] args) {
				
	/*	String s="hash maps";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]&&c[i]!=' ') {
					System.out.print(c[i]);
					
				}
			}
			
		}*/
		System.out.println(" ");
		
		String g="ajithkumar";
		for(int j=0;j<g.length();j++) {
			char ch=g.charAt(j);
			boolean flag=false;
			for(int i=j+1;i<g.length();i++) {
				if(ch==g.charAt(i)) {
					System.out.println(ch+" repeated");
					flag=true;
					break;
				}
				
			}
			if(flag==false) {
				System.out.println(ch+"  is not repeated");
				break;
			}
		}
		
		
	
		
		
	}
	
}
