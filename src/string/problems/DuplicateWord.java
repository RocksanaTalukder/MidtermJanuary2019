package string.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {


        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        //Set<String> duplicates = duplicateWords(st);
        //System.out.println("input : " + st);
        //System.out.println("output : " + duplicates);
        duplicateWords(st);

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

            }

    public static void duplicateWords(String input){
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();
        for(String word : words){
            if(!set.add(word)){
                int timesofOccur = (input.length() - input.replaceAll(word, "").length()) / word.length();
                System.out.println("Word= '" + word + "' time of Occurance= '" + timesofOccur
                        + "' and length= '" + word.length() +"'");
            }
        }
    }


}







