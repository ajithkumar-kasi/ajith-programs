import java.util.Scanner;
public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			if(n==1||n==3||n==5||n==7||n==8||n==10||n==12) {
				for(int i=1;i<=31;i++) {
					System.out.println("Day: "+i);
				}
			}
			else if(n==2) {
				for(int i=1;i<=28;i++) {
					System.out.println("Day: "+i);
				}
			}else if(n>12) {
				System.out.println("Invalid input");
			}
			
			else {
				for(int i=1;i<=30;i++) {
					System.out.println("Day: "+i);
				}	
			}
		}
		
		
		
	}

}
