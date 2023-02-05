import java.util.Scanner;
public class bulidprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			 int count = 0;

			    // There is no prime number less than 2.
			    if (n <= 1) {
			      System.out.println("The number is not prime");
			      return;
			    }

			    // Do a for loop
			    for (int i = 1; i <= n / 2; i++) {
			      if (n % i == 0) {
			        count++;
			      }
			    }

			    // If the number of factors is greater than 1,
			    // the number is not prime.
			    if (count > 1) {
			        System.out.println("The number is not prime");
			    }
			    else {
			      System.out.println("The number is prime");
			    }
			  
		}
		
		
		/*for(int i=2;i<n/2;i++) {
			if(n%2==0){
				System.out.println("It is non prime numbers");	
			}
			else {
				System.out.println("It is prime numbers");
			}
		}*/
		
	
			   		
	}

}
