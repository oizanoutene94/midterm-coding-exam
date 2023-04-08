package string.problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        // Get the length of the longest word
        int longestLength = Collections.max(wordNLength.keySet());

        // Get the longest word
        String longestWord = wordNLength.get(longestLength);

        System.out.println(longestLength + " " + longestWord);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] words = wordGiven.split(" ");

        for (String word : words) {
            int length = word.length();
            String value = map.get(length);

            if (value != null) {
                if (word.compareTo(value) > 0) {
                    map.put(length, word);
                }
            } else {
                map.put(length, word);
            }
        }

        return map;
    }
}


