enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE
	 }
public class iterateenum {
	  public static void main(String[] args) {

	    System.out.println("Access each enum constants");

		    // use foreach loop to access each value of enum
	    for(Size size : Size.values()) {
	    	System.out.print(size + ", ");
	    	}
	    }
	  }