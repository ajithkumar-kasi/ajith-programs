
public class bulidpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=132;
		int bc=a;
		int r,b=0;
		
		while(a>0) {
			r=a%10;
			b=(b*10)+r;
			a=a/10;
		}
		if(bc==b) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		
		
		
		
	}

}
