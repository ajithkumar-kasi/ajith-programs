import java.util.EnumSet;
// create an enum
enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE
	}


public class iterateenumset {
	public static void main(String[] args) {

	    // create an EnumSet class
	    // convert the enum Size into the enumset
	    EnumSet<Size> enumSet = EnumSet.allOf(Size.class);

	    System.out.println("Elements of EnumSet: ");
	    // loop through the EnumSet class
	    for (Size constant : enumSet) {
	      System.out.print(constant + ", ");
	    }

	  }
	 }
