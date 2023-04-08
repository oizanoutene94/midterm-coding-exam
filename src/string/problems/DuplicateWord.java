package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        Map<String, Integer> wordCounts = countDuplicateWords(st);

        // Print the duplicate words and their counts
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            System.out.println(word + " occurs " + count + " times");
        }

        // Calculate the average length of the words
        double totalLength = 0;
        int wordCount = 0;
        String[] words = st.split("\\W+");

        for (String word : words) {
            totalLength += word.length();
            wordCount++;
        }

        double averageLength = totalLength / wordCount;
        System.out.println("Average word length: " + averageLength);
    }

    public static Map<String, Integer> countDuplicateWords(String st) {
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        String[] words = st.split("\\W+");

        for (String word : words) {
            word = word.toLowerCase();
            Integer count = wordCounts.get(word);
            if (count == null) {
                count = 0;
            }
            wordCounts.put(word, count + 1);
        }

        // Remove words with count 1
        Iterator<Map.Entry<String, Integer>> iterator = wordCounts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() == 1) {
                iterator.remove();
            }
        }

        return wordCounts;
    }
}