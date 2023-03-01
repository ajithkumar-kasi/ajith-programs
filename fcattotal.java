import java.util.Scanner;
public class fcattotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int fact=s.nextInt();
		int num=1;
			
		for(int i=1;i<=fact;i++) {
			num=num*i;
		}
		System.out.println(num);
				
		
	}

}
