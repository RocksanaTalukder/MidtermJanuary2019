package string.problems;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;



/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        char str1[] = { 'c', 'a', 't' };
        char str2[] = { 'a', 'c', 't' };

        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

    static boolean areAnagram(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;

        // Sorting both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Comparing sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }
}











//Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


