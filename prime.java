import java.util.Scanner;
public class prime {

	/*static boolean isPrime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) 
				return false;
			}
			return true;
		
	}*/
	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		//System.out.println(isPrime(n));
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				System.out.println(i+" is not prime");
			else
				System.out.println(i+ "is prime");
		}
		
		
	}

}
