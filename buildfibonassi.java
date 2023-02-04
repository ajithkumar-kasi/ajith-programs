import java.util.Scanner;
public class buildfibonassi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0,b=1,c;
		System.out.println("The fibonassi series are: ");
		System.out.print(a+","+b);
		for(int i=1;i<=num;i++) {
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}
			
	}

}
