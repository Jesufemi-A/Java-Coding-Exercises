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

        int [] arr =      {3, 2, 1, 4, 1};
        System.out.println(centeredArray(arr));

        /* Q2

        Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array.
        Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers. The function should return X – Y
        The signature of the function is:
        int f(int[ ] a)

        Examples

        if input array is	            return
        {1}	                            1
        {1, 2}	                        -1
        {1, 2, 3}	                    2
        {1, 2, 3, 4}	                -2
        {3, 3, 4, 4}	                -2
        {3, 2, 3, 4}	                 0
        {4, 1, 2, 3}	                -2
        {1, 1}	                          2
        {}	                              0
         */


        int [] arr1 =         {}	 	;
        System.out.println(f(arr1));

    }

    // Q1 solution
    public static int centeredArray(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length % 2 == 0)
            return 0;

        int middleIndex = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            if (i == middleIndex)
                continue;
            else if (arr[middleIndex] >= arr[i])
                return 0;
        }

        return 1;
    }


    // Q2 solution

    public  static int f(int[] a) {
        if (a.length == 0 || a == null)
            return 0;
        else  if (a.length == 1)
            return a[0];

        // if length > 1

        int odd = 0;
        int even =  0;
        for (int i = 0;  i < a.length; i++) {
            if (a[i] % 2 == 0)
                even += a[i];
            else
                odd += a[i];


        }

        return odd - even;
    }

}