package string.problems;

import org.junit.Assert;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".



        String str1 = "HEART";
        String str2 = "EARTH";

        if (isAnagram(str1, str2)) {
            System.out.println("The strings " + str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println("The strings " + str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        // Convert the strings to character arrays
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        // Compare the sorted character arrays
        return Arrays.equals(str1Array, str2Array);
    }
}


