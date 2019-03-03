package math.problems;

import java.util.ArrayList;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("Missing number is " + findMissingNumber(array));
    }

    static int findMissingNumber(int a[])
    {
        int n = a.length;
        int i;
        int x1 = a[0];
        int x2 = 1;

        for (i = 1; i< n; i++)
            x1 = x1^a[i];

        for ( i = 2; i <= n+1; i++)
            x2 = x2^i;

        return (x1^x2);
    }

}















