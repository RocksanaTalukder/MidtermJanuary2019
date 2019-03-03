package string.problems;

import java.lang.reflect.Array;
import java.util.*;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        Map.Entry<Integer, String> firstEntry = wordNLength.entrySet().iterator().next();
        int largestKey = firstEntry.getKey();
        String largestKeyValue = firstEntry.getValue();

        for (Map.Entry<Integer, String> map : wordNLength.entrySet()) {
            int key = map.getKey();
            if (key > largestKey) {
                largestKey = key;
                largestKeyValue = map.getValue();
            }
        }
        System.out.println( largestKey + " " + largestKeyValue);

        //implement

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String[] words = wordGiven.split(" ");
        int i = 1;
        for (String word: words) {
            map.put(word.length(), word);
            i ++;
        }
        //implement

        return map;
    }
}
