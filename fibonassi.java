import java.util.Scanner;
public class fibonassi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
			
	}

}
