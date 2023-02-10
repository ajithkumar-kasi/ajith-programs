
public class duplicatecharinstring {
    public static void main(String[] args) {  
        /*String string1 = "Greatresponsibility";  
        int count=0; 
        int n=string1.length();       
        char a[] = string1.toCharArray();  
         
        System.out.println("Duplicate characters in a given string: ");  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        } 
        */
        

    	  String str = "w3schoolss are loves";
    	  int cnt = 0;
    	  char[] inp = str.toCharArray();
    	  System.out.println("Duplicate Characters are:");
    	  for (int i = 0; i < str.length(); i++) {
    	   for (int j = i + 1; j < str.length(); j++) {
    	    if (inp[i] == inp[j]) {
    	     System.out.println(inp[j]);
    	     cnt++;
    	     break;
    	    }
    	   }
    	  }
    	 
    	
    }  

}
