
public class stringpattrens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
//1
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
//2
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i+1;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("");
//3
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j+i>5){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
//4		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=i){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
//5
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=i){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=5;j++) {
				if(j<=5-i+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			
			System.out.println("");
		}
		System.out.println("");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j+i>5){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			for(int j=2;j<=5;j++) {
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			
			System.out.println("");
		}
		System.out.println("");

	}

}
