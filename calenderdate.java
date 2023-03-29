import java.util.Scanner;
public class calenderdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=31;i++) {
			if((n==4||n==6||n==9||n==11)&&i==31) {
				
				continue;
			}
			
			System.out.println(i);
			if(n==2&&i==28) {
				break;
			}
		
		}
		
	}

}
