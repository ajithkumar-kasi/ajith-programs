package mypack1;
import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.Sets;


public class unionoftwosets2 {

  public static void main(String[] args) {

	    // create the first set
	    Set<String> languages1 = new HashSet<>();
	    languages1.add("Java");
	    languages1.add("Python");
	    System.out.println("Programming Languages: " + languages1);

	    // create second set
	    Set<String> languages2 = new HashSet<>();
	    languages2.add("English");
	    languages2.add("Spanish");
	    System.out.println("Human Language: " + languages2);

	    Set<String> unionSet = Sets.union(languages1, languages2);
	    System.out.println("Union is: " + unionSet);
	  }
	}