package mypack1;

public class buffersort {

	public static String insertString(
			String originalString,
			String stringToBeInserted,
			int index)
		{

			// Create a new StringBuffer
			StringBuffer newString
				= new StringBuffer(originalString);

			// Insert the strings to be inserted
			// using insert() method
			newString.insert(index + 1, stringToBeInserted);

			// return the modified String
			return newString.toString();
		}

		// Driver code
		public static void main(String[] args)
		{

			// Get the Strings
			String originalString = "GeeksGeeks";
			String stringToBeInserted = "For";
			int index = 4;

			System.out.println("Original String: "
							+ originalString);
			System.out.println("String to be inserted: "
							+ stringToBeInserted);
			System.out.println("String to be inserted at index: "
							+ index);

			// Insert the String
			System.out.println("Modified String: "
							+ insertString(originalString,
											stringToBeInserted,
											index));
		}
	}
