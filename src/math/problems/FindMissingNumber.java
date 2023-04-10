package math.problems;

import org.junit.Assert;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n = 10;
        int missingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is " + missingNumber);
              // ---unit testing--//

        // test data:array={10, 2, 9, 4, 5, 3, 7, 8, 6}

        int expectedMissingNumber=1;
        Assert.assertEquals(expectedMissingNumber,missingNumber);
    }
       public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }
}

