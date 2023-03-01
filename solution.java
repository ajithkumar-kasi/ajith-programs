
public class solution {
	public static void repeated(int i) {
		int a=0,b=0,c=0;
		
		int temp=i;
		if(i<99) {
			if(i>0) {
				int r=i%10;
				a=r;
				i=i/10;
			}
			if(i>0) {
				int r=i%10;
				b=r;
				i=i/10;
			}
			if(a==b) {
				sum(temp);
			}
		}
		else if(i>=100&&i<=500) {
			if(i>0) {
				int r=i%10;
				a=r;
				i=i/10;
			}
			if(i>0) {
				int r=i%10;
				b=r;
				i=i/10;
			}
			if(i>0) {
				int r=i%10;
				c=r;
				i=i/10;
			}
		
			if(a==b||b==c||c==a) {
				sum(temp);
			}
		}
		
	}
	

	public static void sum(int temp) {
		int sum=0;
		int num=temp;
		while(temp>0) {
			int r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		if(sum<=5) {
			System.out.println(num);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=10;i<=500;i++) {
			repeated(i);
			
		}
	}

	

}
