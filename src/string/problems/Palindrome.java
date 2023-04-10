package string.problems;

import org.junit.Assert;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        // im adding a string "HELLO" to see the result of this string as well as the other examples
        String s1 = "MOM";
        String s2 = "DAD";
        String s3 = "MADAM";
        String s4 = "HELLO";

        System.out.println(s1 + " is palindrome -- " + isPalindrome(s1));
        System.out.println(s2 + " is palindrome --" + isPalindrome(s2));
        System.out.println(s3 + " is palindrome --" + isPalindrome(s3));
        System.out.println(s4 + " is palindrome --" + isPalindrome(s4));

        //------ unit testing----//
        //test data//
        String expectedr="MOM";
        Assert.assertEquals(expectedr, s1);
    }
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
    return s.equals(reversed);
    }
}