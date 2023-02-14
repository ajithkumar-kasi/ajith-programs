
public class stringvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="fullstackdeveloper";
		int count=0;
		int ccount=0;
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
			else {
				ccount++;
			}
		}
		System.out.println("Vowels: "+count);
		System.out.println("Consonents: "+ccount);
		
		
	}

}
