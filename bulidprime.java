import java.util.Scanner;
public class bulidprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=2;i<n/2;i++) {
			if(n%2==0){
				System.out.println("It is non prime numbers");	
			}
			else {
				System.out.println("It is prime numbers");
			}
		}
		
		
	}

}
