package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        String s = "ABC";
        int n = s.length();
        permute(s, 0, n - 1);
    }

    public static void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }

    public static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

