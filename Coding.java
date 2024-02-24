public class Coding {
    public static void main(String[] args) {


        // Note: The functions/methods are defined below but called in the main method to test

       /* Q1
       An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than the value of the middle element.
       Note that only arrays with an odd number of elements have a middle element.
       Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
        Examples:

        if the input array is	       return
        {1, 2, 3, 4, 5}	                0 (the middle element 3 is not strictly less than all other elements)
        {3, 2, 1, 4, 5}	                1 (the     middle element 1 is strictly less than all other elements)
        {3, 2, 1, 4, 1}	                0 (the middle element 1 is not strictly less than all other elements)
        {1, 2, 3, 4}	                0 (no middle element)
        {}	                            0 (no middle element)
        {10}	                        1 (the middle element 10 is strictly less than all other elements) */

        int [] arr =      {3, 2, 1, 4, 1}	 	 	;
        System.out.print(centeredArray(arr));

    }

    // Q1 solution
    public static int centeredArray(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length % 2 == 0)
            return 0;

        int middleIndex = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            if (i == middleIndex)
                continue;
            else if (arr[middleIndex] > arr[i])
                return 0;
        }

        return 1;
    }

}