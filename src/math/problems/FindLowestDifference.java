package math.problems;
import java.util.*;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*


         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {20,7,12,30,4,5,40,35};

        int m = array1.length;
        int n = array2.length;

        System.out.println(findLowestDifference(array1,array2,m,n));

    }

    static int findLowestDifference(int A[], int B[], int m, int n)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0, b = 0;

        int result = Integer.MAX_VALUE;



        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            // Move Smaller Value
            if (A[a] < B[b])
                a++;

            else
                b++;
        }

        // return final sma result
        return result;
    }



}






