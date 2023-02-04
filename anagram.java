import java.util.Arrays;

public class anagram {

	public static void main(String args[]) {
		String a="Race";
		String b="care";
		
		a=a.toUpperCase();
		b=b.toUpperCase();
		
		if(a.length()==b.length()) {
			char[] a1=a.toCharArray();
			char[] b1=b.toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(b1);
			
		
			boolean result=Arrays.equals(a1, b1);
			
			if(result) {
				System.out.println("a and b are anagram");
			}
			else {
				System.out.println("a and b are not anagram");
			}
			
		}
		else {
			System.out.println("a and b are not anagram");
		}
	}
}
