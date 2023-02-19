import java.util.Scanner;
public class palindrromeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,sum=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println(" not Palindrome Number");
		}	
	}
}
