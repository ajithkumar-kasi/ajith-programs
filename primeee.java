import java.util.Scanner;
public class primeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
			if(isPrime(n)) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not  prime number");

			
			
		}
		}
		
	}

	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%2==0){
			return false;
		}}
		return true;
	

}}