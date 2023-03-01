import java.util.Scanner;
public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		boolean prime=true;
		
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0&&i!=j) {
					prime=false;
					break;
				}
			}
			if(prime) {
				System.out.println(i);
			}
			prime=true;
		}
		
		
	}

}
