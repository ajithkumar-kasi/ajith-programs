
public class reversestringrecursion {

	public String reverseString(String str)  
	{  
	if(str.isEmpty())  
	{  
	System.out.println("String is empty.");  
	//if the above condition is true returns the same string      
	return str;  
	}   
	else   
	{ 
		
	//return reverseString(str.substring(1))+str.charAt(0);  
	return reverseString(str.substring(0,str.length()-1));
	}  
	} 
		
		
	public static void main(String[] args)   
	{  
	reversestringrecursion rs = new reversestringrecursion();  
	String resultantSting1 = rs.reverseString("JAVATPOINT");  
	String resultantSting2 = rs.reverseString("COMPUTER");  
	String resultantSting3 = rs.reverseString("INDIA");  
	System.out.println(resultantSting1);  
	System.out.println(resultantSting2);  
	System.out.println(resultantSting3);   
	}  
	}  
