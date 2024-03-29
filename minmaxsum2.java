
public class minmaxsum2 {


    // Function to calculate minimum and maximum sum
    static void miniMaxSum(int[] arr)
    {
 
        // Initialize the minElement, maxElement
        // and sum by 0.
        int minElement = 0, maxElement = 0, sum = 0;
 
        // Assigning maxElement, minElement
        // and sum as the first array element
        minElement = arr[0];
        maxElement = arr[0];
        sum = arr[0];
 
        // Traverse the entire array
        for (int i = 1; i < arr.length; i++) {
 
            // calculate the sum of
            // array elements
            sum =sum+ arr[i];
 
            // Keep updating the
            // minimum element
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
 
            // Keep updating the
            // maximum element
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
 
        // print the minimum and maximum sum
        System.out.println((sum - maxElement) + " "
                        + (sum - minElement));
    }
 
    // Driver Code
    public static void main(String args[])
    {
 
        // Test Case 1:
        int a1[] = { 13, 5, 11, 9, 7 };
        // Call miniMaxSum()
        miniMaxSum(a1);
 
        // Test Case 2:
        int a2[] = { 13, 11, 45, 32, 89, 21 };
        miniMaxSum(a2);
 
        // Test Case 3:
        int a3[] = { 6, 3, 15, 27, 9 };
        miniMaxSum(a3);
    }
}